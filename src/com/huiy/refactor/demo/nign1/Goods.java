package com.huiy.refactor.demo.nign1;

import java.util.Date;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月5日
 * @version 1.0
 *
 * 分解临时变量
 */
public class Goods {
   public static final double _winterRate = 1;
   public static final double _winterServiceCharge = 11.5;

   public static final double _summerRate = 1.5;
   public static Date SUMMER_START = new Date("2016-06=01");
   public static Date SUMMER_END =  new Date("2016-10-01");

/*
   public double getPrice(Date date,int quantity){
	   double charge = 0;
	   if(date.before(SUMMER_START)||date.after(SUMMER_END)){
		   charge = quantity*_winterRate+_winterServiceCharge;
	   }else{
		   charge = quantity*_summerRate;
	   }
	   return charge;
   }
*/
   
   public double getCharge(Date date,int quantity){
	   double charge = 0;
	   if(notSummer(date)){
		   charge = winterCharge(quantity);
	   }else{
		   charge = summerCharge(quantity);
	   }
	   return charge;
   }
   
   private boolean notSummer(Date date){
	   return date.before(SUMMER_START)||date.after(SUMMER_END);
   }
   
   private double summerCharge(int quantity){
	   return quantity*_summerRate;
   }
   
   private double winterCharge(int quantity){
	   return quantity*_winterRate+_winterServiceCharge;
   }
   
   
   
}
