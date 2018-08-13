package com.message;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.entity.StarSign;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


/**
 * @Auther: $Yuar
 * @Date: 2018/8/11 10:31
 * @Description:
 */
public class Message {
    private final static  String URL = "http://astro.sina.cn/fortune/starent?";
    private final static  String type_day="type=day&ast=";
    private final static  String type_tomorrow="type=tomorrow&ast=";
    private static Message instance=new Message();
    private static List<StarSign> signListDay;
    private static List<StarSign> signListTorrow;
    
    public static Message getInstance() {
		return instance;
	}

    	
    	
 /** 
 * @Title: getToday 
 * @Description: TODO(这里用一句话描述这个方法的作用) 
 * @param @param month
 * @param @param day
 * @param @return    设定文件 
 * @return StarSign    返回类型 
 * @throws 
 */
public StarSign getToday(int month,int day) {
	 if (signListDay==null) { getStarOfDay();}
	 String star=getConstellation(month, day);
	    
	    for (StarSign s: signListDay) {
		       if(s.getStar().indexOf(star)!=-1) {
		    	 return s;
		    }
	    }
	    return signListDay.get(0);
	 
}   
public StarSign getTomorrow(int month,int day) {
	 if (signListTorrow==null) { 
		 getStarOfTomorrow();}
	 String star=getConstellation(month, day);
	    
	    for (StarSign s: signListTorrow) {
		       if(s.getStar().indexOf(star)!=-1) {
		    	 return s;
		    }

	      
	    }
	    return signListTorrow.get(0);  
	 
} 


public StarSign getToday(String string) {
	 if (signListDay==null) { getStarOfDay();}
	 
	    return signListDay.get(getConstellation(string));  
	 
}   
public StarSign getTomorrow(String string) {
	 if (signListTorrow==null) { 
		 getStarOfTomorrow();}
	
	    

	    return signListTorrow.get(getConstellation(string));  
	 
}

/** 
 * @Title: getStarOfDay 
 * @Description: TODO
 * @param @return    设定文件 
 * @return List<StarSign>    返回类型 
 * @throws 
 */
    private  void getStarOfDay(){
	
    	this.signListDay=new ArrayList<StarSign>();
    	for (int i = 1; i <13 ; i++) {
    		List<String> strings=getWebSiteDataByType("day", i);
    		StarSign sign=encapsulateData(strings);
    		this.signListDay.add(sign);


    	}


    		
    }
    
    /** 
     * @Title: getStarOfTomorrow 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @return    设定文件 
     * @return List<StarSign>    返回类型 
     * @throws 
     */
    private void getStarOfTomorrow(){
    	this.signListTorrow=new ArrayList<StarSign>();
        for (int i = 1; i <13 ; i++) {
            List<String> strings=getWebSiteDataByType("tomorrow", i);
            StarSign sign=encapsulateData(strings);
            this.signListTorrow.add(sign);


        }
        

    }

    /** 
     * @Title: getWebSiteDataByType 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param type
     * @param @param index
     * @param @return    设定文件 
     * @return List<String>    返回类型 
     * @throws 
     */
    private   List<String> getWebSiteDataByType(String type,int index){
    	List<String> strings=new ArrayList<String>();
    	String url=URL+type_day;
    	if (type.equals("tomorrow")){
    		url=URL+type_tomorrow;
    	}
    	Document StarDoc = null;
    	try {
    		StarDoc = Jsoup.connect(url+index).get();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	for (int i = 1; i <18 ; i++) {
    		
    		String str=reTrim(getText(StarDoc, i));
    		if (str.isEmpty()) {continue;}
    		strings.add(str);

    	}
    	return strings;

    }
    /** 
     * @Title: encapsulateData 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param signs
     * @param @return    设定文件 
     * @return StarSign    返回类型 
     * @throws 
     */
    private StarSign encapsulateData(List<String> signs)  {
    	Field[] starfileds=StarSign.class.getDeclaredFields();
    /**
     *  返回Class 对象所表示的类或接口的所有可访问公共字段。
     */
    	Field[] f1=StarSign.class.getFields();

    	StarSign sign=new StarSign();
    	//给StarSign对象赋值
    	for(int i=0;i<starfileds.length;i++){
    		//获取属相名
    		String attributeName=starfileds[i].getName();
        	//将属性名的首字母变为大写，为执行set/get方法做准备
    		String methodName=attributeName.substring(0,1).toUpperCase()+attributeName.substring(1);
    		try{
    			//获取StarSign类当前属性的setXXX方法（私有和公有方法）
    			/*Method setMethod=StarSign.class.getDeclaredMethod("set"+methodName);*/
    			//获取StarSign类当前属性的setXXX方法（只能获取公有方法）
    			Method setMethod=StarSign.class.getMethod("set"+methodName,String.class);
    			//执行该set方法
    			setMethod.invoke(sign,signs.get(i));
    		}catch (NoSuchMethodException e) {
    			try {
    				Method setMethod=StarSign.class.getMethod("set"+methodName,int.class);
    				setMethod.invoke(sign,123);
    			} catch (Exception e2) {
    			try {
                    starfileds[i].set(sign,signs.get(i));
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                }
            }

    		} catch (IllegalAccessException e) {
    			e.printStackTrace();
            

    		} catch (InvocationTargetException e) {
    			e.printStackTrace();
    		}
    	}
    		return  sign;

    }
    /** 
     * @Title: getText 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param document
     * @param @param index
     * @param @return    设定文件 
     * @return String    返回类型 
     * @throws 
     */
    private String getText(Document document, int index){
    	if (!document.select("p").get(index).select("img").isEmpty()){
    		return  getImgName(document,index);
    	}
    
    	return document.select("p").get(index).text().trim().toString();
    
    }
    private String getImgName(Document document, int index){
    	
    	String string= document.select("p").get(index).select("img").attr("src").trim();


    	for (int i = string.length()-1; i >=0 ; i--) {
    		if(string.charAt(i)=='/') {return string.substring(i+1, string.length()).trim(); }
    	}
    	return "";


    }
    /**
     *
     * 功能描述: 截取字符串属性信息
     *
     * @param: String
     * @return:  String
     * @auther: 11598
     * @date: 2018/8/11 16:37
     */
    private String reTrim(String string){
    	int start=0;

    	for (int i = 0; i <string.length() ; i++) {

    		if (string.charAt(i)==65306||string.charAt(i)==58)
    		{
    			start=i;
    		}


    	}
    	if(start==0) {return string;}
    	else {return string.substring((start+1),string.length());}
    }
    /** * 根据月日判断星座
	 *  * @param month
	 *  * @param day 
	 *  * @return int
	 * 
	 */
	private String getConstellation(int m,int d)
	{ 
		final String[] constellationArr = {"魔羯座" ,"水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座","天蝎座", "射手座", "魔羯座" };
		final int[] constellationEdgeDay = { 20,18,20,20,20,21,22,22,22,22,21,21};
		int month=m; int day =d; 
		if (day <= constellationEdgeDay[month-1])
		{ month = month - 1; 
		}
		if (month >= 0) 
		{ return constellationArr[month];
		} //default to return 魔羯
		return constellationArr[11]; 
		}
	private int getConstellation(String string) {
		final String[] constellationArr = {"白羊座","金牛座","双子座","巨蟹座","狮子座","处女座","天秤座","天蝎座","射手座","魔羯座","水瓶座","双鱼座" };
		for (int i = 0; i < constellationArr.length; i++) {
			if (string.equals(constellationArr[i])) {
				return i;
			}
		
		}
		return 0;
		
	}
}
