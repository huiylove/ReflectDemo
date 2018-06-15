package com.huiy.javaimprove.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.text.Document;

import org.apache.http.util.CharArrayBuffer;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��2��9��
 * @version 1.0
 *
 *
 */
public class FileUtil {
	
	/**
	 * ��ȡ����̨������Ϣ
	 * �ݲ�֧����������
	 * @throws IOException 
	 */
	public static String getInputMessage() throws IOException{
        System.out.println("���������������");
		byte[] buff = new byte[1024];//��������
		int count = System.in.read(buff);
		char[] out = new char[count-2];////�����λΪ��������ɾȥ��Ҫ
		for(int i=0;i<count-2;i++){
			out[i] = (char)buff[i];
		}
		/**
		 *  byte ���ֽ��������� �����з����͵ģ�ռ1 ���ֽڣ���С��ΧΪ-128��127 ��
		 *  char ���ַ��������� �����޷����͵ģ�ռ2�ֽ�(Unicode�� ������С��Χ ��0��65535 ��
		 *  char��һ��16λ�����Ƶ�Unicode�ַ���JAVA��char����ʾһ���ַ� ��
		 * */
		String message = new String(out);
		return message;
	}
	
	
	/**
	 * ���ļ�������ʽ�����ļ�
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFile(String src,String dest) throws IOException{
		 FileInputStream fis = new FileInputStream(src);
		 File dfile = new File(dest);
		 if(!dfile.exists()){
			 dfile.createNewFile();
		 }
		 FileOutputStream fos = new FileOutputStream(dfile);
//		 BufferedWriter buffWriter = new BufferedWriter(new FileWriter(dfile));-�ַ���
		 byte[] buff = new byte[1024];
		 int buffRead;
		 //���������н���� len ���ֽڵ����ݶ���һ�� byte ������,���ص��Ƕ�����ֽ���
		 while((buffRead=fis.read(buff,0,buff.length))!=-1){
			 //��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ������
			 fos.write(buff,0,buffRead);
//			 buffWriter.write(new String(buff,"utf-8")); - �ֽ�->�ַ�
		 }
//	    while((buffRead=fis.read(buff))!=-1){
//     	for(int i=0;i<buffRead;i++){
//				fos.write(buff[i]);
//     	}
//		}
//		while((buffRead=fis.read(buff))!=-1){
//			fos.write(buff, 0, buffRead);
//		}
//		while((buffRead=fis.read(buff, 0, buff.length))!=-1){
//			fos.write(buff);
//		}
		 fis.close();
		 fos.close();
	}
	
	
	/**
	 * ���������������ļ�������ʽ�����ļ�
	 * @param is
	 * @throws IOException 
	 */
	public static void downFile(InputStream stream,String filePath) throws IOException{
		FileOutputStream fos = new FileOutputStream(new File(filePath));
		byte[] buff = new byte[1024];
		int buffReader;
		while((buffReader=stream.read(buff, 0,1024))!=-1){
			fos.write(buff, 0, buffReader);
		}
		fos.flush();
		fos.close();
	}
	
	
	/**
	 * PrintStream д�ļ�
	 * @param path
	 * @throws FileNotFoundException
	 */
	public static void PrinStreamDemo(String path) throws FileNotFoundException{
		FileOutputStream fos = new FileOutputStream(path);
		PrintStream ps = new PrintStream(fos);
		for(int i=0;i<10;i++){
			ps.println("this is"+i+"line");
		}
	}
	
	/**
	 * ����StringBufferд�ļ������������ļ�����
	 * @param path
	 * @throws IOException
	 */
	public static void StringBufferDemo(String path) throws IOException{
		File dfile = new File(path);
		 if(!dfile.exists()){
			 dfile.createNewFile();
		 }
		FileOutputStream fos = new FileOutputStream(path);
		for(int i=0;i<10;i++){
			StringBuffer sb = new StringBuffer();
			sb.append("���ǵ�"+i+"��:ǰ����ܵĸ��ַ�����������,Ϊʲô������ֵ����� ");
			fos.write(sb.toString().getBytes("utf-8"));
		}
		fos.close();
	}
	
    /**
     * �ļ�������
     * @param path
     * @param oldName
     * @param newName
     */
    public static void renameFile(String path,String oldName,String newName){
    	if(!oldName.equals(newName)){
    		File oldFile = new File(path+"/"+oldName);
    		File newFile = new File(path+"/"+newName);
    		if(newFile.exists()){
    			System.out.print(newName+"�Ѿ�����");
    		}else{
    			oldFile.renameTo(newFile);
    		}
    	}
    }
    
    
    /**
     * ת���ļ�������Ŀ¼
     * @param fileName
     * @param oldPath
     * @param newPath
     * @param cover
     */
    public static void changeDirectory(String fileName,String oldPath,String newPath,boolean cover){
    	if(!oldPath.equals(newPath)){
    		File oldFile = new File(oldPath+"/"+fileName);
    		File newFile = new File(newPath+"/"+fileName);
    		if(newFile.exists()){
    			if(cover){
    				oldFile.renameTo(newFile);
    			}else{
    				System.out.print(newPath+"�Ѵ���"+fileName);
    			}
    		}else{
    			oldFile.renameTo(newFile);
    		}
    	}
    }
    
    /**
     * ����FileInputStream��ȡ�ļ�
     * @param src
     * @return
     * @throws IOException
     */
    public static String FileInputStreamDemo(String path) throws IOException{
    	File file = new File(path);
    	if(!file.exists()||file.isDirectory()){
    		throw new FileNotFoundException();
    	}
    	FileInputStream fis = new FileInputStream(file);
    	byte[] buff = new byte[1024];
		StringBuffer sb =new StringBuffer();
    	while(-1!=(fis.read(buff))){
    		sb.append(new String(buff).trim());
        	buff = new byte[1024];
    	}
    	fis.close();
    	return sb.toString();
    }
	
    
    
    /**
     * ����BufferedReader��ȡ�ļ�
     * @param src
     * @return
     * @throws IOException
     */
    public static String BufferReaderDemo(String path) throws IOException {
    	File file = new File(path);
    	if(!file.exists()||file.isDirectory()){
    		throw new FileNotFoundException();
    	}
//    	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
    	BufferedReader br = new BufferedReader(new FileReader(file));
    	String bfrline = null;
    	StringBuffer sb = new StringBuffer();
    	bfrline = br.readLine();
//      br.readLine().getBytes("UTF-8");//-�ַ�->�ֽ�
    	while(bfrline!=null){
    		sb.append(bfrline+" ");
    		bfrline = br.readLine();
    	}
    	br.close();
    	return sb.toString();
    }
    
    
    /**
     * ����InputStreamReader��ȡ������,�����ؽ��
     * InputStreamReader   - �ֽ���ת��Ϊ�ַ���
     * @param is
     * @return
     * @throws IOException
     */
    public static String InputStreamReader(InputStream is) throws IOException{
    	Reader reader = new InputStreamReader(is);
    	int capacity = 1024;//�������ݵĳ���
        CharArrayBuffer buffer = new CharArrayBuffer(capacity);
     	char[] tmp = new char[1024];
    	int tempReader ;
    	if((tempReader = reader.read(tmp,0,tmp.length))!=-1){
    		buffer.append(tmp, 0, tempReader);
    	}
    	return buffer.toString();
    	
    }
    
    
    
    /**
     * ����dom4j��ȡxml�ļ�
     * @param path
     * @return
     * @throws DocumentException
     * @throws IOException
     */
//    public static Document readXml(String path) throws DocumentException, IOException{
//        File file = new File(path);
//        FileInputStream fis = new FileInputStream(file);
//        BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
//        SAXReader saxreader = new SAXReader();
// 		List rowList = null;  //��ȡָ��·���µ�Ԫ���б�,����ָ��ȡ���е�data�µ�rowԪ��  
// 		Document document = null;
// 		document = saxreader.read(bufferedreader);
// 		rowList = document.selectNodes("/data/row");  
//		for(Iterator iter = rowList.iterator();iter.hasNext();){  
//			 //��þ����rowԪ��   
//			 Element element = (Element)iter.next();
//			 //���rowԪ�ص����������б�  
//			 List elementList  = element.attributes();
//			 for(Iterator iter1 = elementList.iterator();iter1.hasNext();){  
//				 //��ÿ������ת��Ϊһ���������ԣ�Ȼ���ȡ�����ֺ�ֵ  
//	             AbstractAttribute aa = (AbstractAttribute)iter1.next(); 
//	             System.out.println("Name="+aa.getName()+"Value="+aa.getValue());
//			 }
//			 System.out.println(element.getName());  
//		     System.out.println(element.attributeValue("queryDTO.enterpriseId"));  
//		     //���element������Ԫ�أ�(����width="**")��Ҫ���ø���Ԫ�ص�ֵ�����������·���  
//	         System.out.println(element.elementText("width"));//��Ϊû�У��������Ϊnull��  
//		}
//		bufferedreader.close();
//        return document;
//    }
    
    /**
     * �����ļ���
     * @param path
     */
    public static void createDir(String path){
    	File dir = new File(path);
    	if(!dir.exists()){
//    		file.mkdir();
    		dir.mkdirs();//create any necessary but nonexistent parent directories
    	}
    }
    
    /**
     * �������ļ�
     * @param path
     * @throws IOException 
     */
    public static void createFile(String path) throws IOException{
    	File file = new File(path);
    	if(!file.exists()){
    		file.createNewFile();
    	}
    }
    
    /**
     * ɾ���ļ�
     * @param path
     */
    public static void delFile(String path){
    	File file = new File(path);
    	if(file.exists()&&file.isFile()){
    		file.delete();
    	}
    }
    
    /**
     * ɾ���ļ���--�ݹ�ɾ����Ŀ¼�µ�������Ŀ¼����
     * @param path
     */
    public static void delDir(String path){
    	  File dir = new File(path);
    	   if(dir.exists()){
    		   File[] subs = dir.listFiles();
    		   for(int i=0;i<subs.length;i++){
    			   if(subs[i].isDirectory()){
    				   delDir(path+"/"+subs[i].getName());
    			   }else{
    				   subs[i].delete();
    			   }
    		   }
               dir.delete();
           }
    }
    
	public static void main(String[] args){
		 String src = "C:/Users/user/Desktop/a.txt";//c:/Users/user/Desktop
		 String dest = "C:/Users/user/Desktop/b.txt";
		 try {
//			 System.out.print(FileUtil.getInputMessage());
			 FileUtil.copyFile(src, dest);
//			 FileUtil.PrinStreamDemo(dest);
//			 FileUtil.StringBufferDemo(dest);
//			 FileUtil.renameFile("c:/Users/user/Desktop", "bbb.txt", "bbbccc.txt");
//			 FileUtil.changeDirectory("a.txt", "d:/", "e:/", false);
//			 System.out.println(FileUtil.FileInputStreamDemo("C:/Users/user/Desktop/c.txt"));
//			 System.out.println(FileUtil.BufferReaderDemo("C:/Users/user/Desktop/c.txt"));
//			 FileUtil.readXml("d:/dom4j.xml");
//			 FileUtil.createDir("e:/dir/subdir");
//			 FileUtil.createFile("e:/e.txt");
//			 FileUtil.delFile("e:/e.txt");
//			 FileUtil.delDir("e:/dir");
//			 File f1 = new File("c:/Users/user/Desktop/a.txt");
//			 File f2 = new File("c:/Users/user/Desktop/b.txt");	//ע��c.txt���������1234567890
//			 FileInputStream fis = new FileInputStream(f1);
//			 FileOutputStream fos = new FileOutputStream(f2,false);	//����FileInputStream����
//			 char ch;
//			 byte[] b = new byte[(int)f1.length()];
//			 int reader = fis.read(b,5,3);//read()�����Ƕ�ȡһ���ֽ���Ϊһ����������
//			 System.out.println(reader);
//			 for(int i=0;i<f1.length();i++)
//			 { 
//			 ch=(char)fis.read();//read()���ص��Ƕ����һ���ֽ�����Ӧ��intֵ
//			 fos.write(b[8]);	
//			 }
//			 System.out.println(b[7]);//���b[7]��ӡ�����Ľ����ô����51������ 
//			 fos.close();	//�ر�
		 }catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
    }
	
	
}
