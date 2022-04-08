package com.cpc.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	private static Logger logger =null;
    private static Log logg=null;
    
    public static Log getlogger(Class<?> T){
        if(logger==null){
            //实例化Properties类，处理.properties格式的文件
            Properties props=new Properties();
            try{
                //获取当前工程项目的路径
                String path=System.getProperty("user.dir");
                //获取log4j.properties文件的所在路径
                String filePath=path+"/Configs/log4j.properties";
                //通过数据流读取文件里面的数据
                InputStream is=new FileInputStream(filePath);
                //读取文件
                props.load(is);
            }catch(IOException e){
                e.printStackTrace();
            }
            //通过configure方法输入数据
            PropertyConfigurator.configure(props);
            logger=Logger.getLogger(T);
            logg=new Log();
        }
        return logg;
        
    }
    
    //定义一个静态方法，可以打印自定义的某个测试用例开始执行的日志信息
    public static void startTestCase(String CaseName){

        logger.info("======================================================");
        logger.info("*********     "+CaseName+"用例开始执行"+"     *********");
    }
    //定义一个静态方法，可以打印自定义的某个测试用例结束执行的日志信息
    public static void endTestCase(String CaseName){
        logger.info("*********     "+CaseName+"用例执行结束"+"     *********");        
        logger.info("======================================================");
    }
    //定义一个静态info方法，打印自定义的info级别的日志信息
    public static void info(String message){
        logger.info(message);
        
    }
    //定义一个静态的warn方法，打印自定义的warn级别的日志信息
    public static void warn(String message){
        logger.warn(message);      
    }
    //定义一个静态的error方法，打印自定义的error级别的日志信息
    public static void error(String message){
        logger.error(message);     
    }
    //定义一个静态的fatal方法，打印自定义的fatal级别的日志信息
    public static void fatal(String message){
        logger.fatal(message);     
    }
    //定义一个静态的debug方法，打印自定义的debug级别的日志信息
    public static void debug(String message){
        logger.debug(message);     
    }

}
