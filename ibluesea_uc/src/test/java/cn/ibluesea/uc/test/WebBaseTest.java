package cn.ibluesea.uc.test;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-common.xml", "classpath:applicationContext-mvc.xml","classpath:mybatis-config.xml"})
public abstract class WebBaseTest {

	protected static final Logger logger = Logger.getLogger(WebBaseTest.class);
}
