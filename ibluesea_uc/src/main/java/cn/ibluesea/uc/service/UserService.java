package cn.ibluesea.uc.service;

import java.util.Set;

import cn.ibluesea.uc.model.User;

public interface UserService {

	public User getUserInfo(String userId);
	
	/**
	 * 创建账户  
	 * @param user
	 * @return
	 */
	public User createUser(User user); 
	
	/**
	 * 修改密码
	 * @param userId
	 * @param newPassword
	 */
    public void changePassword(String userId, String newPassword);
    
    /**
     * 添加用户-角色关系
     * @param userId
     * @param roleIds
     */
    public void correlationRoles(String userId, String roleId);
    
    /**
     * 移除用户-角色关系  
     * @param userId
     * @param roleIds
     */
    public void uncorrelationRoles(Long userId, String roleId);
    
    /**
     * 根据用户名查找用户 
     * @param username
     * @return
     */
    		
    public User findByUsername(String userName);
    
    /**
     * 根据用户名查找其角色
     * @param username
     * @return
     */
    public Set<String> findRoles(String userName);
    
    /**
     * 根据用户名查找其权限
     * @param username
     * @return
     */
    public Set<String> findPermissions(String userName);
}
