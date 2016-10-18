package cn.ibluesea.uc.service;

import cn.ibluesea.uc.model.Role;

public interface RoleService {
	
	public Role createRole(Role role);

	public void deleteRole(String roleId);

	/**
	 *  添加角色-权限之间关系
	 * @param roleId
	 * @param permissionIds
	 */
	public void correlationPermissions(String roleId, String... permissionIds);

	/**
	 *  移除角色-权限之间关系
	 * @param roleId
	 * @param permissionIds
	 */
	public void uncorrelationPermissions(String roleId, String... permissionIds);
}
