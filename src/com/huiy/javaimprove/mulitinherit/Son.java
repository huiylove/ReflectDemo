package com.huiy.javaimprove.mulitinherit;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *
 *
 */
public class Son {
	 /** 
     * �ڲ���̳�Father�� 
     */  
    class Father_1 extends Father{  
        @Override
		public int strong(){  
            return super.strong() + 1;  
        }  
    }  
      
    class Mother_1 extends Mother{  
        @Override
		public int kind(){  
            return super.kind() - 2;  
        }  
    }  
      
    public int getStrong(){  
        return new Father_1().strong();  
    }  
      
    public int getKind(){  
        return new Mother_1().kind();  
    }  
}
