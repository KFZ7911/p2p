package com.xmg.p2p.base.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author susan
 * @create 2022-05-23 17:23
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Logininfo extends BaseDomin{

    public static final Integer STATE_NORMAL = 0;   //正常
    public static final Integer STATE_LOCK = 1;     //锁定

    private String username;
    private String password;
    private Integer state;
}
