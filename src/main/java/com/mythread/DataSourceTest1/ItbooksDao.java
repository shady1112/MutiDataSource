package com.mythread.DataSourceTest1;

import org.apache.ibatis.annotations.Param;

import java.util.List;



public interface ItbooksDao {
    long countByExample(ItbooksExample example);

    int deleteByExample(ItbooksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Itbooks record);

    int insertSelective(Itbooks record);

    List<Itbooks> selectByExample(ItbooksExample example);

    Itbooks selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Itbooks record, @Param("example") ItbooksExample example);

    int updateByExample(@Param("record") Itbooks record, @Param("example") ItbooksExample example);

    int updateByPrimaryKeySelective(Itbooks record);

    int updateByPrimaryKey(Itbooks record);
}