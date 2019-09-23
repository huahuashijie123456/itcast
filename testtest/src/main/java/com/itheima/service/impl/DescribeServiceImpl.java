package com.itheima.service.impl;

import com.itheima.domain.Describe;
import com.itheima.mapper.DescribeMapper;
import com.itheima.service.DescribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescribeServiceImpl implements DescribeService {

    @Autowired
    private DescribeMapper describeMapper;


    /**
     * 查询所有
     *
     * @return
     */
    public List<Describe> findAll() {
        return describeMapper.findAll();
    }

    /**
     * 数据回显
     *
     * @param id
     * @return
     */
    public Describe findById(Integer id) {
        return describeMapper.findById(id);
    }

    /**
     * 修改数据
     *
     * @param describe
     */
    public void update(Describe describe) {
        describeMapper.update(describe);
    }
}
