package com.huiy.javaimprove.clone;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *��ĸ����д�뵽һ���ֽ����У��ٴ��ֽ����н���������������Ϳ��Դ���һ���µĶ����ˣ�
 *���Ҹ��¶�����ĸ����֮�䲢���������ù�������⣬����ʵ�ֶ�������
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//д���ʼ�  
        Email email = new Email("��μӻ���","�������12:30���������Ҳμӻ���...");  
          
        Person person1 =  new Person("����",email);  
          
        Person person2 =  CloneUtils.clone(person1); //person1.clone();  
        person2.setName("����");  
        Person person3 =   CloneUtils.clone(person1);//person1.clone();  
        person3.setName("����");  
          
        person1.getEmail().setContent("�������12:00���������Ҳμӻ���...");  
        
        System.out.println(person1.getName() + "���ʼ������ǣ�" + person1.getEmail().getContent());  
        System.out.println(person2.getName() + "���ʼ������ǣ�" + person2.getEmail().getContent());  
        System.out.println(person3.getName() + "���ʼ������ǣ�" + person3.getEmail().getContent());  
	}

}
