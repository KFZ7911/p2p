package com.xmg.p2p.base.mapper;

import com.xmg.p2p.base.domain.Logininfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogininfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Logininfo record);

    Logininfo selectByPrimaryKey(Long id);

    List<Logininfo> selectAll();

    int updateByPrimaryKey(Logininfo record);

    /**
     * 根据用户名查询用户个数
     * @param username
     * @return
     */
    int queryCountByUsername(String username);

}