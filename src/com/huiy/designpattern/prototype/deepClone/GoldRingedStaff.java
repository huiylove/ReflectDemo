package com.huiy.designpattern.prototype.deepClone;

import java.io.Serializable;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月17日
 * @version 1.0
 */
public class GoldRingedStaff implements Serializable {
	 	private float height = 100.0f;
	    private float diameter = 10.0f;
	    
	    /**
	     * 增长行为，每次调用长度和半径增加一倍
	     */
	    public void grow(){
	        this.diameter *= 2;
	        this.height *= 2;
	    }
	    
	    /**
	     * 缩小行为，每次调用长度和半径减少一半
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
