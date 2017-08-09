package com.huiy.refactor.demo.nine5;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年6月6日
 * @version 1.0
 *  Replace Nested Conditional With Guard Clauses
 *  单一入口  
 *  单一出口  并不那么有用
 */
public class Test {

   public static final boolean _isDead = false;
   public static final boolean _isSeparated = false;
   public static final boolean _isRetired = false;

   double geyPayAmount(){
	   //单独检查  “卫语句”
	   if(_isDead) return deadAmount();
	   if(_isSeparated) return separatedAmount();
	   if(_isRetired) return retiredAmount();
	   return normalAmount();
	   
	   /* 
	    * Consolidate Conditional Expression
	    * 合并条件表达式
	    * if(!(_isDead||_isSeparated||_isRetired)){
	    *     return normalAmount()
	    * }
	    * 
	    *return !(_isDead||_isSeparated||_isRetired)?normalAmount():0;
	    * */
	   
   }
   
   double deadAmount(){ return 0;}
   double separatedAmount(){ return 0;}
   double retiredAmount(){ return 0;}
   double normalAmount(){ return 0;}

   
}
