package com.fuiou.chain;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��5��31��
 * @version 1.0
 *
 *
 */
public class FundHandler extends Handler{
	
	@Override
	public double handleRequest(double pay,double payh) {
		double fund = pay*0.5*0.07;
		//1W�ⶥ
		if(fund>5000){
			fund = 5000;
		}
		payh += fund;
        if(getSuccessor() != null)  
        {  
            return getSuccessor().handleRequest(pay,payh);  
        }  
    	return fund;
	}
}
