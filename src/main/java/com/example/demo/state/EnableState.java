package com.example.demo.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <pre>
 *
 * 描述：
 * 版本：
 * 日期：2019-06-06 08:35
 * 作者：Chenny
 * <br>修改记录
 * <br>修改日期        修改人          修改内容
 *
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnableState implements Serializable {

    private String name;

    private Integer value;
}
