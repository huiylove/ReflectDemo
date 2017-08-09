package com.huiy.javaimprove.anonymousinnerclass;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 * 初始化匿名内部类
 *
 */
public class OutClass {
  public InClass getInClass(final String name){
	  return new InClass(){
		 String name_;
		 //构造代码块完成初始化工作
		 {
			 this.name_ = name;
		 }
		 
		 public String getName(){
			 return name_;
		 }
	  };
  }
  
  public static void main(String[] args){
	  OutClass oc = new OutClass();
	  InClass ic = oc.getInClass("hello world");
	  System.out.println(ic.getName());
	  
  }
}
