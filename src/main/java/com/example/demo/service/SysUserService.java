package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.SysUserMapper;
import com.example.demo.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * 描述：
 * 版本：
 * 日期：2019/7/11 9:09
 * 作者：Chenny
 */
@Service
@Slf4j
public class SysUserService extends ServiceImpl<SysUserMapper, SysUser> implements Serializable {

    @Autowired
    private SysUserMapper userMapper;

    public List<SysUser> list() {
        return baseMapper.list();
    }

    public List<SysUser> getUsers() {

        return baseMapper.selectList(null);
    }



    /*public PageInfo<SysUser> getPage(QueryWrapper ew){
        List<SysUser> us = baseMapper
    }*/

//    public SysUser getUserInfo(SysUser user){
//        return baseMapper.selectList()
//    }
}
