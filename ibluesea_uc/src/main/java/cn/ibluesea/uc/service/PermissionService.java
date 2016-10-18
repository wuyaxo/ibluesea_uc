package cn.ibluesea.uc.service;

import org.apache.shiro.authz.Permission;

public interface PermissionService {

	public Permission createPermission(Permission permission);

	public void deletePermission(String permissionId);
}
