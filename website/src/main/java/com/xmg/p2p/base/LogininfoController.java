package com.xmg.p2p.base;

import com.xmg.p2p.base.domain.JSONResult;
import com.xmg.p2p.base.service.LogininfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author susan
 * @create 2022-05-23 17:24
 */
@Controller
public class LogininfoController {

    @Autowired
    private LogininfoService logininfoService;

    /**
     * 注册功能
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/register.do")
    @ResponseBody
    public JSONResult register(String username,String password){

        JSONResult json = new JSONResult();

        try {
            logininfoService.register(username,password);
        } catch (RuntimeException re) {
            re.printStackTrace();
            json.setSuccess(false);
            json.setMsg(re.getMessage());
        }

        return json;
    }

    @RequestMapping("/checkUsername.do")
    @ResponseBody
    public boolean c(String username) {
        return !logininfoService.checkUsername(username);

    }
}
