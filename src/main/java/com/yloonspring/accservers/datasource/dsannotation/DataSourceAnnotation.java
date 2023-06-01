package com.yloonspring.accservers.datasource.dsannotation;
import com.yloonspring.accservers.constant.DBConstant;
import org.springframework.stereotype.Component;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Documented
@Retention(RUNTIME)
@Target({METHOD,TYPE})
public @interface DataSourceAnnotation {
    String value() default DBConstant.DS_MASTER; //默认主数据源value
}
