package com.example.demo.enums;

import com.example.demo.state.EnableState;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：状态
 * 版本：
 * 日期：2019-06-06 08:35
 * 作者：Chenny
 */
@NoArgsConstructor
public enum StatusEnum {

    OK(200,"SUCCESS"),

    NOTFOND(404, "NOTFOND"),

    EXCEPTION(500, "EXCEPTION"),

    ERR(505, "ERR");

    private Integer value;

    private String name;

    StatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer value() {
        return value;
    }

    public static List<EnableState> getStates() {
        List<EnableState> list = new ArrayList();
        StatusEnum[] array = StatusEnum.values();
        for (StatusEnum l1 : array) {
            list.add(new EnableState(l1.name, l1.value));
        }
        return list;
    }
}
