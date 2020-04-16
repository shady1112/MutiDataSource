package com.mythread.DataSourceTest1;

import lombok.Data;

import java.io.Serializable;

/**
 * itbooks
 * @author 
 */
@Data
public class Itbooks implements Serializable {
    private Integer id;

    /**
     * 书籍名称
     */
    private String bookname;

    /**
     * 书籍封面
     */
    private String bookimage;

    /**
     * 书籍价格
     */
    private Integer bookprice;

    /**
     * 书籍路径
     */
    private String booklink;

    /**
     * 书籍描述
     */
    private String bookinfo;

    private static final long serialVersionUID = 1L;
}