package com.huiy.javaimprove.anonymousinnerclass;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 * ��ʼ�������ڲ���
 *
 */
public class OutClass {
  public InClass getInClass(final String name){
	  return new InClass(){
		 String name_;
		 //����������ɳ�ʼ������
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
