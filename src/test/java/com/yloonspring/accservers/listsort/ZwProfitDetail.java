package com.yloonspring.accservers.listsort;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class ZwProfitDetail{

    /** 收益日期 */
    private String profitDate;
    /** 收益金额 */
    private BigDecimal profitAmt;
}