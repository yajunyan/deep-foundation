package com.yloonspring.accservers.fundtest;

import com.alibaba.nacos.common.utils.JacksonUtils;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.apache.commons.codec.binary.BinaryCodec;
import org.assertj.core.util.DateUtil;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2021/12/16 10:09
 * @ClassName: FundTest
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
@Slf4j
public class FundTest {

    @Test
    public void test() throws ParseException {

//        Date date = new Date();
//        var sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        java.text.SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd ");
//        String s = "2021-12-16 ";
//
//        FundAsset fundAsset = new FundAsset();
//        FundProduct fundProduct = new FundProduct();
//        fundProduct.setNavDate("2021-12-16");
//        fundAsset.setNavdate(formatter.parse(s));
//        Record record = new Record();
//        /* 判断fundasset记录中净值日期是否为空，如果为空则可以直接更新，如果不为空则与产品表中的净值日期比较 */
//        if (fundAsset.getNavdate() == null || "".equals(fundAsset.getNavdate())) {
//            record.setNavdate(cn.hutool.core.date.DateUtil.parse(fundProduct.getNavDate()).toJdkDate());
//            log.info("资产表中净值日期为空，产品表中净值日期为={}", fundProduct.getNavDate());
//        } else {
//            if (fundAsset.getNavdate().compareTo(cn.hutool.core.date.DateUtil.parse(fundProduct.getNavDate()).toJdkDate()) > 0) {
//                log.info("资产表中净值日期navdate={},产品表中净值日期navdate={},不更新资产表净值", fundAsset.getNavdate(), fundProduct.getNavDate());
//            } else {
//                record.setNavdate(cn.hutool.core.date.DateUtil.parse(fundProduct.getNavDate()).toJdkDate());
//                log.info("资产表中净值日期为={}，产品表中净值日期为={}", fundAsset.getNavdate(), fundProduct.getNavDate());
//            }
//        }
//
//        log.info("retrunvalue: {}", record.getNavdate());
    }

    @Test
    public void test1() {
        int val = 16;
  //      log.info("\nval:[{}]\n-val:[{}]\nresult:[{}]", Integer.toBinaryString(val), Integer.toBinaryString(-val), (val & -val));
//        List<FundAsset>  fundAssets = new ArrayList<>();
//        FundAsset  fundAsset  = new FundAsset();
//        fundAsset.setNavdate("1");
//        fundAssets.add(fundAsset);
//        FundAsset  fundAsset2 = new FundAsset();
//        fundAsset2.setNavdate("2");
//        fundAssets.add(fundAsset2);
//
//        FundAsset  fundAsset1 = new FundAsset();
//        fundAsset1.setNavdate("3");
//        fundAssets.add(fundAsset1);
////
////        for(FundAsset  fundAssett: fundAssets){
////            fundAssett.setNavdate("4");
////        }
//
//        fundAssets.stream().forEach(test->{
//            test.setNavdate("3");
//        });
//        log.info("[{}]", JacksonUtils.toJson(fundAssets));

        Boolean   value = Boolean.FALSE;
        if(value){
            log.info("value output");
        }
        int l=0xf0;
         log.info(Integer.toBinaryString(l));
    }

    @Test
    public void test2() {
        final AtomicInteger one = new AtomicInteger(8);
        int array[] = {0,1, 2, 3, 4, 5, 6, 7};
//        for (int i = 0; i < 10; i++) {
//            log.info("[{}]", array[one.getAndIncrement() & array.length - 1]);
//        }
        log.info("[{}]", 8&7);
//        int a =one.getAndIncrement();
//        int b=one.getAndIncrement();
//        log.info("a="+a);
//        log.info("one=" + one );
//        log.info("b="+b);
//        log.info("one=" + one );
//
//        AtomicInteger two=new AtomicInteger(5);
//        int b=two.incrementAndGet();
//        System.out.println("b="+b);
//        System.out.println("two=" +two);
//            Map<String,String>  trade = new ConcurrentHashMap<>();
//            trade.put("aaa",null);

           Map<String, String> trade1 = new HashMap<>();
           trade1.put("1","1");
           trade1.put("2", null);
           log.info(String.valueOf(trade1.containsKey("2")));
           log.info(trade1.get("2"));
           log.info(trade1.get("3"));
    }


}
