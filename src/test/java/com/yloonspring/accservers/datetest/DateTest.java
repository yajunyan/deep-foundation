package com.yloonspring.accservers.datetest;

import cn.hutool.core.date.DateUtil;
import com.alibaba.nacos.common.utils.JacksonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @date: 2022/7/27 14:45
 * @author: yanyajun
 * @since: 1.0
 */
@Slf4j
public class DateTest {

    @Test
    public void test1(){
//        LocalDateTime  localDateTime = strConverLocaldatatime("2020-07-11");
////        log.info(JacksonUtils.toJson(localDateTime));

        LocalDate expectDate = LocalDateTime.ofInstant(DateUtil.parse("2020-07-11").toJdkDate().toInstant(), ZoneId.systemDefault()).toLocalDate();
log.info(String.valueOf(expectDate));
    }

    public LocalDateTime strToLocalDateTime(String str,String format){
        DateTimeFormatter df = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(str,df);
    }

    public static LocalDateTime strConverLocaldatatime(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate=LocalDate.parse(date,dateTimeFormatter);
        return localDate.atStartOfDay();
    }

}
