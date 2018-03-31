package com.imooc.enums;

import lombok.Getter;

/**
 * Created by SqMax on 2018/3/18.
 */
@Getter
public enum OrderStatusEnum implements CodeEnum{
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCLE(2,"已取消"),
    ;
    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
