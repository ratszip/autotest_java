package com.cpc.Util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CPCDateUtils {

	//获取当前年月日
	public static String getCurDate() {
		DateFormat dateformat= new SimpleDateFormat("yyyy-MM-dd");  //创建一个data format对象
	     //利用Date()获取当前时间
		Date date = new Date();
	    return dateformat.format(date);    //格式化时间,并用String对象存储
	}
	public static String getCurDate2() {
		DateFormat dateformat= new SimpleDateFormat("yyyy/MM/dd");  //创建一个data format对象
	    Date date = new Date();  //利用Date()获取当前时间
	    return dateformat.format(date);    //格式化时间,并用String对象存储
	}
	public static String getCurDate3() {
		DateFormat dateformat= new SimpleDateFormat("yyyyMMdd");  //创建一个data format对象
	    Date date = new Date();  //利用Date()获取当前时间
	    return dateformat.format(date);    //格式化时间,并用String对象存储
	}
	
	
	//获取当前日期的后一天
	public static String getSpecifiedDayAfter(String specifiedDay,int n) {
		Calendar c = Calendar.getInstance();

		Date date = null;

		try {
		date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);

		} catch (ParseException e) {
		e.printStackTrace();

		}

		c.setTime(date);

		int day = c.get(Calendar.DATE);

		c.set(Calendar.DATE, day + n);

		String dayAfter = new SimpleDateFormat("yyyy-MM-dd")

		.format(c.getTime());

		return dayAfter;

		}

	
	
	//DataUtil类主要用于生成年、月、日、时、分、秒的信息，用于生成保存截图文件目录名和文件名

    //格式化输入日期，@return 返回字符型日期
    public static String format(Date date,String format){
        String result="";
        try{
            if(date != null){
               DateFormat df=new SimpleDateFormat(format);
                result=df.format(date);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    //返回年份   @return返回年份
    public static int getYear(Date date){
        Calendar c=Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.YEAR);
    }
    
    //返回月份 @return返回月份
    public static int getMonth(Date date){
        Calendar c= Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MONTH)+1;
    }
    
    //返回在月份中的第几天  @return返回月份中的第几天
    public static int getDay(Date date){
        Calendar c= Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_MONTH);
    }
    
    /*
     * 返回小时
     * @param date
     * 日期
     * @return返回小时
     */
    public static int getHour(Date date){
        Calendar c=Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.HOUR_OF_DAY);
    }
    
    /*
     * 返回分钟
     * @param date
     * 日期
     * @return返回分钟
     */
    public static int getMinute(Date date){
        Calendar c=Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MINUTE);
    }
    
    /*
     * 返回秒
     * @param date
     * 日期
     * @return返回秒
     */
    public static int getSecond(Date date){
        Calendar c=Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.SECOND);
    }
}
