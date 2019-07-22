package com.example.demo.service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.LogMapper;
import com.example.demo.entity.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.Serializable;

/**
 * 描述：
 * 版本：
 * 日期：2019/7/11 9:09
 * 作者：Chenny
 */
@Service
public class LogService extends ServiceImpl<LogMapper,SysLog> implements Serializable{

    @Autowired
    private LogMapper logMapper;

}
