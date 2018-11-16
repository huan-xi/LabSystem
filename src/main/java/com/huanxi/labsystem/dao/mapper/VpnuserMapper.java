package com.huanxi.labsystem.dao.mapper;

import com.huanxi.labsystem.dao.pojo.Vpnuser;
import com.huanxi.labsystem.dao.pojo.VpnuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VpnuserMapper {
    long countByExample(VpnuserExample example);

    int deleteByExample(VpnuserExample example);

    int deleteByPrimaryKey(Integer vpnId);

    int insert(Vpnuser record);

    int insertSelective(Vpnuser record);

    List<Vpnuser> selectByExample(VpnuserExample example);

    Vpnuser selectByPrimaryKey(Integer vpnId);

    int updateByExampleSelective(@Param("record") Vpnuser record, @Param("example") VpnuserExample example);

    int updateByExample(@Param("record") Vpnuser record, @Param("example") VpnuserExample example);

    int updateByPrimaryKeySelective(Vpnuser record);

    int updateByPrimaryKey(Vpnuser record);
}