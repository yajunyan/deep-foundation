package com.yloonspring.accservers.datasource.condition;

import com.yloonspring.accservers.constant.DBConstant;
import com.yloonspring.accservers.datasource.dsannotation.DataSourceAnnotation;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yanyajun@umpay.com
 * @版本: 1.0
 * @创建日期: 2020年11月09日 下午4:37:40
 * @ClassName DataSourceCondition
 * @类描述-Description: 通过yml配置文件获取数据源来源，可以为动态、主、备
 * @修改记录:
 * @版本: 1.0
 */
public class DataSourceQualifierCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return dynamicChoice(conditionContext, annotatedTypeMetadata) ? true : conditionChoice(conditionContext, annotatedTypeMetadata);
    }

    /* 如果yml配置文件中配置的数据源key是动态的，则直接返回true去将master/slvae都建立上 */
    private boolean dynamicChoice(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata){
        return DBConstant.DS_DYNAMIC.equalsIgnoreCase(conditionContext.getEnvironment().getProperty(DBConstant.DS_YML_QUALIFIER_KEY));
    }

    /* 否则根据yml配置文件中的key对比，如果@DataSourceQualifier中用的master则实例化master，否则实例化slvae */
    private boolean conditionChoice(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata){
        return annotatedTypeMetadata.getAnnotationAttributes(DataSourceAnnotation.class.getName(), true).get("value")
                .equals(conditionContext.getEnvironment().getProperty(DBConstant.DS_YML_QUALIFIER_KEY));
    }

}
