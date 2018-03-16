package com.huiy.designpattern.prototype.deepClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class Monkey implements Cloneable,Serializable {
    //���
    private int height;
    //����
    private int weight;
    //����
    private Date birthDate;
    //�𹿰�
    private GoldRingedStaff staff;
    /**
     * ���캯��
     */
    public Monkey(){
        this.birthDate = new Date();
        this.staff = new GoldRingedStaff();
    }
    
    
    /**
     * ��¡����
     */
    @Override
	public Object clone(){
        Monkey temp = null;
        try {
            temp = (Monkey) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            return temp;
        }
    }
    
    
    /**
     * ��¡����
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    public Object deepClone() throws IOException, ClassNotFoundException{
    	//������д������
    	ByteArrayOutputStream bos = new  ByteArrayOutputStream();
    	ObjectOutputStream oos = new ObjectOutputStream(bos);
    	oos.writeObject(this);
    	//�����������
    	ByteArrayInputStream bis = new  ByteArrayInputStream(bos.toByteArray());
    	ObjectInputStream ois = new ObjectInputStream(bis);
    	return ois.readObject();
    }
    
    
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public GoldRingedStaff getStaff() {
        return staff;
    }
    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }
    
}