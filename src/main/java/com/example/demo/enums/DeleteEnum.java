package com.example.demo.enums;

import com.example.demo.state.DeleteState;
import com.example.demo.state.EnableState;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：删除状态
 * 版本：
 * 日期：2019-06-06 08:35
 * 作者：Chenny
 */
public enum DeleteEnum {

    TRUE(1, true),

    FALSE(2, false);

    private Integer value;

    private Boolean name;

    DeleteEnum(Integer value, boolean name) {
        this.value = value;
        this.name = name;
    }

    public Integer value() {
        return value;
    }

    public static List<DeleteState> getStates() {
        List<DeleteState> list = new ArrayList();
        DeleteEnum[] array = DeleteEnum.values();
        for (DeleteEnum l1 : array) {
            list.add(new DeleteState(l1.name, l1.value));
        }
        return list;
    }

}
