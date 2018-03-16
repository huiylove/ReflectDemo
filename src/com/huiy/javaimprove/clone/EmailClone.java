package com.huiy.javaimprove.clone;


/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *
 *
 */
public class EmailClone implements Cloneable{
	
    @Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	private String title;  
	private String content;  

	public EmailClone(String title,String content){
		this.title = title;
		this.content = content;
	}
      
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
