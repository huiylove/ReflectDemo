package com.huiy.javaimprove.anonymousinnerclass;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *���������ڲ����ʹ�����Ǵ���һ��ȱ�ݵģ����������ܱ�ʹ��һ�Σ�
 *���������ڲ���ʱ������������һ�������ʵ��������Ķ����������ʧ��
 *���������ڲ����ǲ��ܹ����ظ�ʹ��
 *
 */
public class Test {
	
//	public Test(Bird bird){
//		System.out.println(bird.getName() + "�ܹ��� " + bird.fly() + "��");  
//	}
      
    public void test(Bird bird){  
		System.out.println(bird.getName() + "�ܹ��� " + bird.fly() + "��");  

    }
    
    public void testFly(CanFly fly){  
		System.out.println("��ô��:"+fly.fly());  

    }
    
    public static void main(String[] args) {  
        Test test = new Test();
        test.test(new Bird() {  
            
              @Override
			public int fly() {  
            	  return 10000;  
              }  
	            
	          @Override
			public String getName() {  
	              return "����";  
	          }
         });
        
        test.testFly(new CanFly(){
        	
        	@Override
			public String fly() {  
          	  return "�ó���";  
            } 
        });
    }
}
