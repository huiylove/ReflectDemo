package com.huiy.javastatic;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��28��
 * @version 1.0
 *
 *
 */
public class MemberClass {
	
//	  private static MemberClass MemberClass;
	  
	  private MemberClass(){}
	  
      private static class  StaticMemberClassInner{
    	  private static MemberClass  staticMemberClass = new MemberClass();
      }
      
      public static MemberClass getInstance(){
    	  return StaticMemberClassInner.staticMemberClass;
      }
      
      public class NostaticMemberClass{
    	  public void sayHello(){
    		  System.out.println("hello world!!");
    	  }
      }
      
      public static void main(String[] args){
    	  StaticMemberClassInner staticClass = new StaticMemberClassInner();
    	  NostaticMemberClass nostaticClass =  getInstance().new NostaticMemberClass();
    	  nostaticClass.sayHello();
      }
      
      public static Operation operation;
}
