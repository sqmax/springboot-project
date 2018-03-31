package com.imooc.enums;

import lombok.Getter;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by SqMax on 2018/3/17.
 */
@Getter
public enum  ProductStatusEnum implements CodeEnum{

    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }

}
