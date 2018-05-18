package tx;

import org.apache.log4j.Logger;
import org.junit.Test;
/*
程序中为什么用日志组件？
	简单来说，为了项目后期部署上线后的维护、错误排查！
		Log4j 开源的日志组件！
	使用步骤：
		1. 下载组件，引入jar文件;
			log4j-1.2.11.jar
		2. 配置 :  src/log4j.properties(固定)
		3.导包的时候需要注意 在 org.apache.log4j下

	# 通过根元素rootLogger指定日志输出的级别、目的地： 
	#  日志输出优先级： debug < info < warn < error     向上显示不是向下显示  比如设置 为 info那么 debug级别就不会显示   
	#  日志输出目的地： console,file 名字随便取，这里些什么下面就要些什么
	
	log4j.rootLogger=info,A,B
	                                                     级别         目的地         目的地
	                                                     
	############# 日志输出到控制台 #############
	
	# 日志输出到控制台使用的api类
	log4j.appender.A=org.apache.log4j.ConsoleAppender
	
	# 指定日志输出的格式： 灵活的格式
	log4j.appender.A.layout=org.apache.log4j.PatternLayout
	
	# 具体格式内容
	log4j.appender.A.layout.ConversionPattern=%d %p %c.%M()-%m%n
	
	############# 日志输出到文件 #############
	
	# 日志输出到文件使用的api类
	log4j.appender.B=org.apache.log4j.RollingFileAppender
	
	# 文件参数： 指定日志文件路径(当前的目录在webapps中,  ../代表的是tomcat目录;这样需要使用浏览器访问才行不能Test)
	log4j.appender.B.File=../logs/log.log
	
	# 文件参数： 指定日志文件最大大小
	log4j.appender.B.MaxFileSize=5kb
	
	# 文件参数： 指定产生日志文件的最大数目
	log4j.appender.B.MaxBackupIndex=100
	
	# 日志格式
	log4j.appender.B.layout=org.apache.log4j.PatternLayout
	
	# 具体格式内容
	log4j.appender.B.layout.ConversionPattern=%d %c.%M()-%m%n

*/
public class TestLog {
	private static Logger logger = Logger.getLogger(TestLog.class); 
	@Test
	public void test(){
		    // 记录debug级别的信息  
            logger.debug("This is debug message.");  
			
            // 记录info级别的信息  
	        logger.info("This is info message."); 
	       
	        // 记录warn级别的信息  
	        logger.warn("This is warn message.");
	       
	        // 记录error级别的信息  
	        logger.error("This is error message."); 
        
	}
}
