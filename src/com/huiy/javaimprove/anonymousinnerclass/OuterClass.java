package com.huiy.javaimprove.anonymousinnerclass;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *
 *
 */
public class OuterClass {
	    private String sex;  
	    public static String name = "chenssy";  
	      
	    /** 
	     *��̬�ڲ��� 
	     */  
	    static class InnerClass1{  
	        /* �ھ�̬�ڲ����п��Դ��ھ�̬��Ա */  
	        public static String _name1 = "chenssy_static";  
	          
	        public void display(){  
	            /*  
	             * ��̬�ڲ���ֻ�ܷ�����Χ��ľ�̬��Ա�����ͷ��� 
	             * ���ܷ�����Χ��ķǾ�̬��Ա�����ͷ��� 
	             */  
	            System.out.println("OutClass name :" + name);  
	        }  
	    }  
	      
	    /** 
	     * �Ǿ�̬�ڲ��� 
	     */  
	    class InnerClass2{  
	        /* �Ǿ�̬�ڲ����в��ܴ��ھ�̬��Ա */  
	        public String _name2 = "chenssy_inner";  
	        /* �Ǿ�̬�ڲ����п��Ե�����Χ����κγ�Ա,�����Ǿ�̬�Ļ��ǷǾ�̬�� */  
	        public void display(){  
	            System.out.println("OuterClass name��" + name);  
	        }  
	    }  
	      
	    /** 
	     * @desc ��Χ�෽�� 
	     * @author chenssy 
	     * @data 2013-10-25 
	     * @return void 
	     */  
	    public void display(){  
	        /* ��Χ����ʾ�̬�ڲ��ࣺ�ڲ���. */  
	        System.out.println(InnerClass1._name1);  
	        /* ��̬�ڲ��� ����ֱ�Ӵ���ʵ������Ҫ��������Χ�� */  
	        new InnerClass1().display();  
	          
	        /* �Ǿ�̬�ڲ��Ĵ�����Ҫ��������Χ�� */  
//	        OuterClass.InnerClass2 inner2 = new OuterClass().new InnerClass2();  
	        //�Ǿ�̬�ڲ��Ĵ�����Ҫ��������Χ�࣬��仰����û�д�
	        // �������Ѿ�����Χ�������ˣ��������Χ����ǵ�ǰ����this�����Բ���new OuterClass().	        
	        InnerClass2 inner2 = new InnerClass2();
	        /* ��λ�Ǿ�̬�ڲ���ĳ�Ա��Ҫʹ�÷Ǿ�̬�ڲ����ʵ�� */  
	        System.out.println(inner2._name2);  
	        inner2.display();  
	    }  
	      
	    public static void main(String[] args) {  
	        OuterClass outer = new OuterClass();  
	        outer.display();  
	    }  
}
