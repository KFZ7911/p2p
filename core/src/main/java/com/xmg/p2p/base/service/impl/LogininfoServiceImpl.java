package com.xmg.p2p.base.service.impl;

import com.xmg.p2p.base.domain.Logininfo;
import com.xmg.p2p.base.mapper.LogininfoMapper;
import com.xmg.p2p.base.service.LogininfoService;
import com.xmg.p2p.base.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sus
 * @create 2022-05-23 21:06
 */
@Service
public class LogininfoServiceImpl implements LogininfoService {

    @Autowired
    private LogininfoMapper logininfoMapper;

    @Override
    public void register(String username, String password) {

        //判断用户名是否存在
        int count = logininfoMapper.queryCountByUsername(username);
        if (count > 0) {
            //用户名存在，直接抛错
            throw new RuntimeException("该用户名已被注册！");
        }
        //如果不存在，设值并保存这个对象
        Logininfo logininfo = new Logininfo();
        logininfo.setUsername(username);
        logininfo.setPassword(MD5.encode(password));
        logininfo.setState(Logininfo.STATE_NORMAL);

        logininfoMapper.insert(logininfo);
    }

    @Override
    public boolean checkUsername(String username) {
        return logininfoMapper.queryCountByUsername(username) > 0;
    }
}
