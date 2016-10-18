package cn.ibluesea.uc.dao;

import org.springframework.stereotype.Repository;

import cn.ibluesea.uc.datasource.DataSource;
import cn.ibluesea.uc.model.Permission;

@Repository
@DataSource(name ="ibluesea_uc")
public interface PermissionMapper {
	
    int deleteByPrimaryKey(String id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}