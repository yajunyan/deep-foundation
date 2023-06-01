package com.yloonspring.accservers.exception;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yanyajun@umpay.com
 * @版本: 1.0
 * @创建日期: 2020/11/23 19:56
 * @ClassName: E
 * @类描述-Description: 系统异常捕获，手动控制事务捕获异常类
 * @修改记录:
 * @版本: 1.0
 */
public class ExceptionInfo extends  Exception {
    private static final long serialVersionUID = 404L;

    private String retCode;
    private String retMsg;

    /* 设置构造方法 */
    public ExceptionInfo(String  retCode,String retMsg){
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
}
