package com.xmg.p2p.base.service;

/**
 * @author sus
 * @create 2022-05-23 21:06
 */
public interface LogininfoService {
    /**
     * 注册功能
     * @param username
     * @param password
     */
    void register(String username,String password);

    boolean checkUsername(String username);
}
