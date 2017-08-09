package com.huiy.javaimprove.clone;

import java.io.Serializable;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2016��12��22��
 * @version 1.0
 *
 *
 */
public class Email implements Serializable{
	
    private String title;  
	private String content;  

	public Email(String title,String content){
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
