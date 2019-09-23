package com.itheima;

import com.itheima.domain.Describe;
import com.itheima.service.DescribeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test1 {

    @Autowired
    private DescribeService describeService;

    @Test
    public void test1() {
        List<Describe> all = describeService.findAll();
        System.out.println(all);
    }

    @Test
    public void test() {
        Describe byId = describeService.findById(1);
        System.out.println(byId);
    }

    @Test
    public void test2() {
        Describe describe = new Describe();
        describe.setId(1);
        describe.setName("hehe");
        describeService.update(describe);
    }
}
