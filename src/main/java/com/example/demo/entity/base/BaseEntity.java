package com.example.demo.entity.base;
import com.example.demo.enums.DeleteEnum;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Date;

@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = -6775222679549090142L;
    /**
     * id
     */
    @Id
//    @TableId(type = IdType.AUTO)
    @Column
    private String id;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd 24HH:mm:ss")
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除标记 --系统只做逻辑删除
     */
    @Column(length = 8)
    private Integer delState = DeleteEnum.FALSE.value();

    /**
     * 启用标记 --默认已启用
     */
    @Column(length = 8)
    private Integer enable = DeleteEnum.TRUE.value();

    private String remark;

}