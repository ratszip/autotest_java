package com.cpc.Util;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class ReportExtent implements TestWatcher
{
	private ExtentReports extent;
	WebDriver d=PublicData.d;
    public ReportExtent(ExtentReports extent) {
        this.extent = extent;
    }

	@Override
	public void testSuccessful(ExtensionContext context) {
		// TODO Auto-generated method stub
		 ExtentTest test = extent.startTest(context.getDisplayName(), "-");
		 	//extent.
	        // step log
	        test.log(LogStatus.PASS, LogStatus.PASS.toString().toLowerCase()+"ed");
	        flushReports(extent, test);
	}

	@Override
	public void testFailed(ExtensionContext context, Throwable cause) {
		 ExtentTest test = extent.startTest(context.getDisplayName(), "Test failed");

	        // step log
	        test.log(LogStatus.FAIL, cause);
	        test.log(LogStatus.INFO,"ScreenShot Blow:"+test.addScreenCapture("..\\"+picpath(d,context.getDisplayName())));
	        flushReports(extent, test);
	        
	}
    private void flushReports(ExtentReports extent, ExtentTest test){
        // ending test
        extent.endTest(test);
        // writing everything to document
        extent.flush();
    }
    
    public  String picpath(WebDriver driver,String CaseName) {
    	try{
    	Date date=new Date();
        String picDir=".\\reports\\extentreports\\Screenshot\\"+String.valueOf(CPCDateUtils.getYear(date))+"-"
        +String.valueOf(CPCDateUtils.getMonth(date))+"-"+String.valueOf(CPCDateUtils.getDay(date));
        if(!new File(picDir).exists()){
            FileUtil.createDir(picDir);
        }
        String filePath=picDir+"\\"+String.valueOf(CPCDateUtils.getcurTime())+"-"+CaseName+".png";
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //将截图文件内容写入磁盘中，生成截图文件
        FileUtils.copyFile(srcFile, new File(filePath));
        return filePath;
    }catch(Exception e){
        e.printStackTrace();
        return "screenshot fail";
    }
        
    }
    
}
