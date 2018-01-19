package com.huiy.designpattern.prototype.deepClone;

import java.io.IOException;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��1��17��
 * @version 1.0
 */
public class TheGreatestSage {
    private Monkey monkey = new Monkey();
    
    public void change() throws IOException, ClassNotFoundException{
        Monkey copyMonkey = (Monkey)monkey.deepClone();
        System.out.println("��ʥ����������ǣ�" + monkey.getBirthDate());
        System.out.println("��¡�Ĵ�ʥ�������ǣ�" + monkey.getBirthDate());
        System.out.println("��ʥ�������¡�Ĵ�ʥ�Ƿ�Ϊͬһ������ " + (monkey == copyMonkey));
        System.out.println("��ʥ������еĽ𹿰� �� ��¡�Ĵ�ʥ���еĽ𹿰��Ƿ�Ϊͬһ������ " + (monkey.getStaff() == copyMonkey.getStaff()));
    }
    
    public static void main(String[]args) throws IOException, ClassNotFoundException{
        TheGreatestSage sage = new TheGreatestSage();
        sage.change();
    }
}
