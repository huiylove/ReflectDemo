package com.huiy.javastatic;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��4��28��
 * @version 1.0
 *
 *
 */
public enum Operation {
    PLUS(){
		@Override
		public void getResult() {
			System.out.println(numA+numB);
		}
    },
    MUILT() {
		@Override
		public void getResult() {
			// TODO Auto-generated method stub
			
		}
	};
    
    private static int numA = 10;
	private static int numB =11;
    
     
    public abstract void getResult();
    
    
    
}
