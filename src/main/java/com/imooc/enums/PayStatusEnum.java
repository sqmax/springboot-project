package com.imooc.enums;

import lombok.Getter;

/**
 * Created by SqMax on 2018/3/18.
 */
@Getter
public enum PayStatusEnum implements CodeEnum{
    WAIT(0,"未支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
