package tx;

import org.apache.log4j.Logger;
import org.junit.Test;
/*
������Ϊʲô����־�����
	����˵��Ϊ����Ŀ���ڲ������ߺ��ά���������Ų飡
		Log4j ��Դ����־�����
	ʹ�ò��裺
		1. �������������jar�ļ�;
			log4j-1.2.11.jar
		2. ���� :  src/log4j.properties(�̶�)
		3.������ʱ����Ҫע�� �� org.apache.log4j��

	# ͨ����Ԫ��rootLoggerָ����־����ļ���Ŀ�ĵأ� 
	#  ��־������ȼ��� debug < info < warn < error     ������ʾ����������ʾ  �������� Ϊ info��ô debug����Ͳ�����ʾ   
	#  ��־���Ŀ�ĵأ� console,file �������ȡ������Щʲô�����ҪЩʲô
	
	log4j.rootLogger=info,A,B
	                                                     ����         Ŀ�ĵ�         Ŀ�ĵ�
	                                                     
	############# ��־���������̨ #############
	
	# ��־���������̨ʹ�õ�api��
	log4j.appender.A=org.apache.log4j.ConsoleAppender
	
	# ָ����־����ĸ�ʽ�� ���ĸ�ʽ
	log4j.appender.A.layout=org.apache.log4j.PatternLayout
	
	# �����ʽ����
	log4j.appender.A.layout.ConversionPattern=%d %p %c.%M()-%m%n
	
	############# ��־������ļ� #############
	
	# ��־������ļ�ʹ�õ�api��
	log4j.appender.B=org.apache.log4j.RollingFileAppender
	
	# �ļ������� ָ����־�ļ�·��(��ǰ��Ŀ¼��webapps��,  ../�������tomcatĿ¼;������Ҫʹ����������ʲ��в���Test)
	log4j.appender.B.File=../logs/log.log
	
	# �ļ������� ָ����־�ļ�����С
	log4j.appender.B.MaxFileSize=5kb
	
	# �ļ������� ָ��������־�ļ��������Ŀ
	log4j.appender.B.MaxBackupIndex=100
	
	# ��־��ʽ
	log4j.appender.B.layout=org.apache.log4j.PatternLayout
	
	# �����ʽ����
	log4j.appender.B.layout.ConversionPattern=%d %c.%M()-%m%n

*/
public class TestLog {
	private static Logger logger = Logger.getLogger(TestLog.class); 
	@Test
	public void test(){
		    // ��¼debug�������Ϣ  
            logger.debug("This is debug message.");  
			
            // ��¼info�������Ϣ  
	        logger.info("This is info message."); 
	       
	        // ��¼warn�������Ϣ  
	        logger.warn("This is warn message.");
	       
	        // ��¼error�������Ϣ  
	        logger.error("This is error message."); 
        
	}
}
