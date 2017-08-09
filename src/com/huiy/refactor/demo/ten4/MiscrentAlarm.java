package com.huiy.refactor.demo.ten4;

import java.util.Arrays;
import java.util.List;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月7日
 * @version 1.0
 * Separate Query from Modifier
 *
 */
public class MiscrentAlarm {
	
	String foundMiscrent(String[] people){
		List miscrents = Arrays.asList(new String[]{"Don","Jhone","kent"});
		for(int i=0;i<people.length;i++){
			if(miscrents.contains(people[i])){
				sendAlert();
				return people[i];
			}
		}
		return "";
	}
	
	String foundPerson(String[] people){
		List miscrents = Arrays.asList(new String[]{"Don","Jhone","kent"});
		for(int i=0;i<people.length;i++){
			if(miscrents.contains(people[i])){
				return people[i];
			}
		}
		return "";
	}
	
	void sendAlert(String[] people){
		if(!foundPerson(people).equals("")){
			sendAlert();
		}
	};
	
	void sendAlert(){
		System.out.print("有人入侵");
	}
	void checkSecurity(String[] people){
//		 String found = foundMiscrent(people);
		sendAlert(people);
		String found = foundPerson(people);
	}
	
}
