package com.cpc.Util;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot{


    /*
     *截图方法，调用了时间类和文件操作类的静态方法并传入一个String类型的CaseName参数
     *用来以yyyy-MM-dd的格式生成目录，HH时mm分ss秒加CaseName的格式命名文件名。如果命
     *名不需要CaseName去掉代码中的两处CaseName即可。
     */
    public static void DN(WebDriver driver,String CaseName) {
        try{
            //生成日期对象
            Date date=new Date();
            //调用DateUtil类中的方法，生成截图所在的文件夹日期类型
            String picDir="C:\\"+"errorScreenshot"+"\\"+String.valueOf(CPCDateUtils.getYear(date))+"-"
            +String.valueOf(CPCDateUtils.getMonth(date))+"-"+String.valueOf(CPCDateUtils.getDay(date));
            if(!new File(picDir).exists()){
                FileUtil.createDir(picDir);
            }
            //调用DataUtil类中的方法，生成截图文件的时间名称
            String filePath=picDir+"//"+String.valueOf(CPCDateUtils.getHour(new Date()))+"时"+
            String.valueOf(CPCDateUtils.getMinute(new Date()))+"分"+
            String.valueOf(CPCDateUtils.getSecond(new Date()))+"秒"+CaseName+".png";
            //进行截图，并将文件内容保存在srcFile对象中
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            File scrFile = new File("");
//            scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //将截图文件内容写入磁盘中，生成截图文件
            FileUtils.copyFile(srcFile, new File(filePath));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
