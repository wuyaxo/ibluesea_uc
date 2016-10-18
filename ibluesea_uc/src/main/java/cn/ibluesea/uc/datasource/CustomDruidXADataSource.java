package cn.ibluesea.uc.datasource;

import com.alibaba.druid.pool.xa.DruidXADataSource;

import cn.ibluesea.uc.commons.utils.AESTool;

public class CustomDruidXADataSource extends DruidXADataSource{

	private static final long serialVersionUID = 5199341592553700752L;
	@Override
	public void setPassword(String password){
		byte[] iv = { 0x0, 0xb, 0x2, 0xf, 0x5, 0xd, 0xf, 0x9, 0xf, 0xa,
				0x0, 0x0, 0x0, 0x0, 0x0, 0x0 };
		try {
			super.setPassword(AESTool.decrypt(password, "iyuna.net"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}