package cn.ibluesea.uc.dao;

import org.springframework.stereotype.Repository;

import cn.ibluesea.uc.datasource.DataSource;
import cn.ibluesea.uc.model.User;

@Repository
@DataSource(name ="ibluesea_uc")
public interface UserMapper {
	
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);
    
    User selectByUserNameKey(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}