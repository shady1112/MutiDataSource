package com.mythread.Service;

import com.mythread.DataSourceTest1.Itbooks;
import com.mythread.DataSourceTest1.ItbooksDao;
import com.mythread.DataSourceTest2.Test;
import com.mythread.DataSourceTest2.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiDataSourveServiceImpl implements MultiDataSourveService{


    @Autowired
    ItbooksDao itbooksDao;
    @Autowired
    TestDao testDao;
    @Override
    public void TestInsertData() {
        Itbooks itbooks = new Itbooks();
        itbooks.setBookname("ssss");
        itbooksDao.insert(itbooks);
    }

    @Override
    public void TestInsertData2() {
        Test test = new Test();
        test.setContent("22222");
        testDao.insert(test);
    }


}
