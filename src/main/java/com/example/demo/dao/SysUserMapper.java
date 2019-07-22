package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.SysUser;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 描述：
 * 版本：
 * 日期：2019/7/11 8:57
 * 作者：Chenny
 */
@Component
public interface SysUserMapper extends BaseMapper<SysUser> {

    public List<SysUser> list();

}
