package cn.ibluesea.uc.datasource;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

	String name() default DataSource.master;

	public static String master = "data01";

	public static String slave1 = "data02";

	public static String slave2 = "data03";

}
