package com.xmg.p2p.base.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author susan
 * @create 2022-05-24 13:18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JSONResult {

    private boolean success = true;
    private String msg;

}
