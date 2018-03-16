package com.huiy.javaimprove.equals;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 * ��java�н��бȽϣ�������Ҫ���ݱȽϵ�������ѡ����ʵıȽϷ�ʽ��
       1) ������ʹ��equals���� �� 
       2) ���Ͱ�ȫ��ö�٣�ʹ��equals��== ��
       3) ����Ϊnull�Ķ����� : ʹ�� == �� equals ��
       4) ������ : ʹ�� Arrays.equals ��
       5) ��float��double���ԭʼ�������� : ʹ�� == ��
       6) float����: ʹ��Float.foatToIntBitsת����int���ͣ�Ȼ��ʹ��==��
       7) double����: ʹ��Double.doubleToLongBitת����long���ͣ�Ȼ��ʹ��==
 *
 */
public class Test {
    private String name ;
    private final int age = 5;
    
    public Test(String name){
    	this.name = name;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a =  "a";
        String b =  "a";
        if(a.equals(b)){
        	System.out.println("dddd");
        }
	}
	
	//��дequalsʱ�Ƽ�ʹ��getClass���������жϡ�������ʹ��instanceof
	@Override
	public boolean equals(Object object){  
        if(object.getClass() == Test.class){//(object instanceof Test){  
        	Test p = (Test) object;  
            if(p.getName() == null || name == null){  
                return false;  
            }  
            else{  
                return name.equalsIgnoreCase(p.getName());  
            }  
        }  
        return false;  
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}  
	
}
