package cn.ibluesea.uc.dao;

import org.springframework.stereotype.Repository;

import cn.ibluesea.uc.datasource.DataSource;
import cn.ibluesea.uc.model.Role;

@Repository
@DataSource(name ="ibluesea_uc")
public interface RoleMapper {
	
    int deleteByPrimaryKey(String id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}