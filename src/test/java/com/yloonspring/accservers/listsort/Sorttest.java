package com.yloonspring.accservers.listsort;

import com.alibaba.nacos.common.utils.JacksonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @date: 2022/7/26 14:45
 * @author: yanyajun
 * @since: 1.0
 */
@Slf4j
public class Sorttest {

    @Test
    public void test1() {
        ZwProfitDetail zwProfitDetail = new ZwProfitDetail();
        zwProfitDetail.setProfitAmt(BigDecimal.valueOf(1100));
        zwProfitDetail.setProfitDate("20220701");
        ZwProfitDetail zwProfitDetail1 = new ZwProfitDetail();
        zwProfitDetail1.setProfitAmt(BigDecimal.valueOf(1200));
        zwProfitDetail1.setProfitDate("20220702");
        ZwProfitDetail zwProfitDetail2 = new ZwProfitDetail();
        zwProfitDetail2.setProfitAmt(BigDecimal.valueOf(11100));
        zwProfitDetail2.setProfitDate("20220705");
        List<ZwProfitDetail> zwProfitDetails = new ArrayList<>();
        zwProfitDetails.add(zwProfitDetail);
        zwProfitDetails.add(zwProfitDetail1);
        zwProfitDetails.add(zwProfitDetail2);

        //Collections.sort(zwProfitDetails);



        Collections.sort(zwProfitDetails, Comparator.comparing(ZwProfitDetail::getProfitDate).reversed());
        log.info(JacksonUtils.toJson(zwProfitDetails));
        Collections.sort(zwProfitDetails, Comparator.comparing(ZwProfitDetail::getProfitDate));
        log.info(JacksonUtils.toJson(zwProfitDetails));

        zwProfitDetails = zwProfitDetails.subList(0,2);
        log.info(JacksonUtils.toJson(zwProfitDetails));
    }


}
