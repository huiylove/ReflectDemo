package com.huiy.javaimprove.mulitinherit;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *
 *
 */
public class Son {
	 /** 
     * 内部类继承Father类 
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
