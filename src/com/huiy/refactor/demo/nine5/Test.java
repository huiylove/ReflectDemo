package com.huiy.refactor.demo.nine5;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��6��6��
 * @version 1.0
 *  Replace Nested Conditional With Guard Clauses
 *  ��һ���  
 *  ��һ����  ������ô����
 */
public class Test {

   public static final boolean _isDead = false;
   public static final boolean _isSeparated = false;
   public static final boolean _isRetired = false;

   double geyPayAmount(){
	   //�������  ������䡱
	   if(_isDead) return deadAmount();
	   if(_isSeparated) return separatedAmount();
	   if(_isRetired) return retiredAmount();
	   return normalAmount();
	   
	   /* 
	    * Consolidate Conditional Expression
	    * �ϲ��������ʽ
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
