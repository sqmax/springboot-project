package com.imooc.dto;

import lombok.Data;

/**
 * Created by SqMax on 2018/3/19.
 */
@Data
public class CartDTO {

    /**商品*/
    private String productId;

    /** 数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
