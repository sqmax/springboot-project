package com.imooc.utils;

import com.imooc.enums.CodeEnum;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by SqMax on 2018/3/29.
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each:enumClass.getEnumConstants()){
            if(code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
