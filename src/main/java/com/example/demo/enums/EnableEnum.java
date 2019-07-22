package com.example.demo.enums;

import com.example.demo.state.EnableState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：启用状态
 * 版本：
 * 日期：2019-06-06 08:35
 * 作者：Chenny
 */
@NoArgsConstructor
public enum EnableEnum {

    ENABLE(1, "启用"),

    LOCKED(2, "锁定");

    private Integer value;

    private String name;

    EnableEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer value() {
        return value;
    }

    public static List<EnableState> getStates() {
        List<EnableState> list = new ArrayList();
        EnableEnum[] array = EnableEnum.values();
        for (EnableEnum l1 : array) {
            list.add(new EnableState(l1.name, l1.value));
        }
        return list;
    }
}
