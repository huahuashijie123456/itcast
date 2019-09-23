package com.itheima.service;

import com.itheima.domain.Describe;

import java.util.List;

public interface DescribeService {
    /**
     * 查询所有
     *
     * @return
     */
    public List<Describe> findAll();

    /**
     * 修改的数据回显
     *
     * @param id
     * @return
     */
    public Describe findById(Integer id);

    /**
     * 修改数据
     *
     * @param describe
     */
    public void update(Describe describe);

}
