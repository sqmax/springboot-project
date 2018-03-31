package com.imooc.form;

import lombok.Data;

/**
 * Created by SqMax on 2018/3/31.
 */
@Data
public class CategoryForm {

    private Integer categoryId;
    /**类目名字**/
    private String categoryName;
    /** 类目编号**/
    private Integer categoryType;

}
