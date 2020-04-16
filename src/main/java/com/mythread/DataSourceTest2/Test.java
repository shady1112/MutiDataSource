package com.mythread.DataSourceTest2;

import java.io.Serializable;
import lombok.Data;

/**
 * test
 * @author 
 */
@Data
public class Test implements Serializable {
    private Integer id;

    private String content;

    private static final long serialVersionUID = 1L;
}