package com.itheima.controller;

import com.itheima.domain.Describe;
import com.itheima.service.DescribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/user")
@ResponseBody
public class DescribeController {

    @Autowired
    private DescribeService describeService;

    @RequestMapping("/findAll")
    public List<Describe>  findAll() {
        return describeService.findAll();
    }

    @RequestMapping("/findbyid")
    public Describe findById( Integer id) {
        Describe byId = describeService.findById(id);
        return byId;
    }
    @RequestMapping("/update")
    public void  update(@RequestBody Describe describe){
        describeService.update(describe);
    }
}
