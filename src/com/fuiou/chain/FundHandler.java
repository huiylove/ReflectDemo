package com.fuiou.chain;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class FundHandler extends Handler{
	
	@Override
	public double handleRequest(double pay,double payh) {
		double fund = pay*0.5*0.07;
		//1W封顶
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
