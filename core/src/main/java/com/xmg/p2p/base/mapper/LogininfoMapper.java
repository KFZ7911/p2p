package com.xmg.p2p.base.mapper;

import com.xmg.p2p.base.domain.Logininfo;

import java.util.List;

public interface LogininfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Logininfo record);

    Logininfo selectByPrimaryKey(Long id);

    List<Logininfo> selectAll();

    int updateByPrimaryKey(Logininfo record);

    int queryCountByUsername(String username);
}