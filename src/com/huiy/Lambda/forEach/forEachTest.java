package com.huiy.Lambda.forEach;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class forEachTest {
	public static void main(String[] args) {
		String[] atp = {"Rafael Nadal", "Novak Djokovic",  
			       "Stanislas Wawrinka",  
			       "David Ferrer","Roger Federer",  
			       "Andy Murray","Tomas Berdych",  
			       "Juan Martin Del Potro"};  
//			List<String> players =  Arrays.asList(atp);  
			  
			// 以前的循环方式  
//			for (String player : players) {  
//			     System.out.print(player + "; ");  
//			}  
//			players.forEach((player)-> System.out.println(player));
			
			// 使用 lambda 表达式以及函数操作(functional operation)  
//			players.forEach((player) -> System.out.print(player + "; "));  
			   
			// 在 Java 8 中使用双冒号操作符(double colon operator)  
//			players.forEach(System.out::println);
			
			// 1.1 使用匿名内部类根据 name 排序 players  
//			Arrays.sort(atp, new Comparator<String>() {  
//			    @Override  
//			    public int compare(String s1, String s2) {  
//			        return (s1.compareTo(s2));  
//			    }  
//			}); 
			// 1.2 使用lambda根据 name 排序 players  
			//Arrays.sort(atp, (s1,s2)->s1.compareTo(s2));
		
			Arrays.sort(atp, (s1,s2)->s1.compareTo(s2));;  
			List<String> players =  Arrays.asList(atp);  
			players.forEach((player)->System.out.println(player));
			
			
		
	}
}
