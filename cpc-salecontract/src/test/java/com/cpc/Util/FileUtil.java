package com.cpc.Util;

import java.io.File;
import java.io.IOException;


//FileUtil 类用于创建目录和文件，此例子只是用此类的创建目录的方法
public class FileUtil{
    final static Log log=Log.getlogger(FileUtil.class);
    
    public static boolean createFile(String destFileName){
        File file=new File(destFileName);
        if(file.exists()){
            Log.info("创建单个文件"+destFileName+"失败，目标文件已存在！");
            return false;
        }
        if(destFileName.endsWith(File.separator)){
            Log.info("创建单个文件"+destFileName+"失败，目标文件不能为目录！");
            return false;
        }
        //判断目标文件所在目录是否存在
        if(!file.getParentFile().exists()){
            //如果目标文件所在的目录不存在，则创建父目录
            Log.info("目录文件所在目录不存在，准备创建它！");
            if(!file.getParentFile().mkdirs()){
                Log.info("创建目标文件所在目录失败！");
                return false;
            }
        }
        //创建目标问价
        try{
            if(file.createNewFile()){
                Log.info("创建单个文件"+destFileName+"成功！");
                return true;
            }else{
                Log.info("创建单个文件"+destFileName+"失败！");
                return false;
            }
        }catch(IOException e){
            e.printStackTrace();
            Log.info("创建单个文件"+destFileName+"失败！"+e.getMessage());
            return false;
        }
    }
    public static boolean createDir(String destDirName){
        File dir=new File(destDirName);
        if(dir.exists()){
            Log.info("创建目录"+destDirName+"失败，目标目录已存在");
            return false;
        }
        //创建目录
        if(dir.mkdirs()){
            Log.info("创建目录"+destDirName+"成功！");
            return true;
        }else{
            Log.info("创建目录"+destDirName+"失败！");
            return false;
        }
    }

}
