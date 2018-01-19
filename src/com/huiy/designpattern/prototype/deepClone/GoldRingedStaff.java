package com.huiy.designpattern.prototype.deepClone;

import java.io.Serializable;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class GoldRingedStaff implements Serializable {
	 	private float height = 100.0f;
	    private float diameter = 10.0f;
	    
	    /**
	     * ������Ϊ��ÿ�ε��ó��ȺͰ뾶����һ��
	     */
	    public void grow(){
	        this.diameter *= 2;
	        this.height *= 2;
	    }
	    
	    /**
	     * ��С��Ϊ��ÿ�ε��ó��ȺͰ뾶����һ��
	     */
	    public void shrink(){
	        this.diameter /= 2;
	        this.height /= 2;
	    }

		public float getHeight() {
			return height;
		}

		public float getDiameter() {
			return diameter;
		}

		public void setHeight(float height) {
			this.height = height;
		}

		public void setDiameter(float diameter) {
			this.diameter = diameter;
		}

	    
}
