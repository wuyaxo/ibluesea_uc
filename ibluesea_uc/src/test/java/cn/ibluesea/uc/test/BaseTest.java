package cn.ibluesea.uc.test;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-common.xml", "classpath:mybatis-config.xml" })
public abstract class BaseTest {
	protected
	static final Logger logger = Logger.getLogger(BaseTest.class);

}
