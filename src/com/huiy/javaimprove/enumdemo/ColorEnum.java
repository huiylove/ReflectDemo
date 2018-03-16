package com.huiy.javaimprove.enumdemo;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��30��
 * @version 1.0
 */
public enum ColorEnum {
	
		Red("1","2","3"),
		Yellow("1","2","3");
		
		 private String r;
		 private String g;
		 private String b;
		 
		 private ColorEnum(String r,String g,String b){
			 this.r = r;
			 this.g = g;
			 this.b = b;
		 }
		 
		public String getR() {
			return r;
		}
		public String getG() {
			return g;
		}
		public String getB() {
			return b;
		}
		public void setR(String r) {
			this.r = r;
		}
		public void setG(String g) {
			this.g = g;
		}
		public void setB(String b) {
			this.b = b;
		}
		 
		 

}
