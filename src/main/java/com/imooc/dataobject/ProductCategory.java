package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 类目
 * Created by SqMax on 2018/3/17.
 */
@Entity
@DynamicUpdate
@Data
//@Table(name = "product_category")
public class ProductCategory {
    /**类目id.**/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /**类目名字**/
    private String categoryName;
    /** 类目编号**/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory(){

    }
    public ProductCategory(String categoryName,Integer categoryType){
        this.categoryName=categoryName;
        this.categoryType=categoryType;
    }


}
