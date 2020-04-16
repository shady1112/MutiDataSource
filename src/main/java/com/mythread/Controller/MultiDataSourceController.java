package com.mythread.Controller;


import com.mythread.Service.MultiDataSourveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiDataSourceController {

        @Autowired
        private MultiDataSourveService multiDataSourveService;


        @RequestMapping(value = "insertData", method=RequestMethod.POST)
        public void  TestInsertData(){
                multiDataSourveService.TestInsertData();
        }
        @RequestMapping(value = "insertData2" ,method = RequestMethod.POST )
        public void TestInsertData2(){
                multiDataSourveService.TestInsertData2();
        }





}
