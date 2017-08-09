package com.fuiou.chain;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年5月31日
 * @version 1.0
 *
 *
 */
public class InsuranceHandler extends Handler{

	@Override
	public double handleRequest(double pay,double payh) {
		double insurance = pay*0.5*0.12;
		//1W封顶
		if(insurance>10000){
			insurance = 10000;
		}
		payh +=insurance;
        if(getSuccessor() != null)  
        {  
            return getSuccessor().handleRequest(pay,payh);  
        }  
    	return insurance;
	}

}
