package com.example.demo.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 描述：
 * 版本：
 * 日期：2019/7/11 8:21
 * 作者：Chenny
 */
@Data
@TableName("tb_sys_log")
public class SysLog implements Serializable {

    private static final long serialVersionUID = -6775222679549090142L;
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private long id;
    private String remoteAddr;
    private String requestUrl;
    private String methodName;
    private long logType;
    private String logName;
    private String bizName;
    private String description;
    private String requestData;
    private String className;
    private java.util.Date startTime;
    private java.util.Date endTime;
    private long executeTime;
    private String location;
    private String responseData;
    private String userId;

}
