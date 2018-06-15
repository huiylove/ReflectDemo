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
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年2月9日
 * @version 1.0
 *
 *
 */
public class FileUtil {
	
	/**
	 * 获取控制台输入信息
	 * 暂不支持中文输入
	 * @throws IOException 
	 */
	public static String getInputMessage() throws IOException{
        System.out.println("请输入您的命令∶");
		byte[] buff = new byte[1024];//缓冲数组
		int count = System.in.read(buff);
		char[] out = new char[count-2];////最后两位为结束符，删去不要
		for(int i=0;i<count-2;i++){
			out[i] = (char)buff[i];
		}
		/**
		 *  byte 是字节数据类型 ，是有符号型的，占1 个字节；大小范围为-128—127 。
		 *  char 是字符数据类型 ，是无符号型的，占2字节(Unicode码 ）；大小范围 是0—65535 ；
		 *  char是一个16位二进制的Unicode字符，JAVA用char来表示一个字符 。
		 * */
		String message = new String(out);
		return message;
	}
	
	
	/**
	 * 以文件流的形式复制文件
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
//		 BufferedWriter buffWriter = new BufferedWriter(new FileWriter(dfile));-字符流
		 byte[] buff = new byte[1024];
		 int buffRead;
		 //此输入流中将最多 len 个字节的数据读入一个 byte 数组中,返回的是读入的字节数
		 while((buffRead=fis.read(buff,0,buff.length))!=-1){
			 //将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流
			 fos.write(buff,0,buffRead);
//			 buffWriter.write(new String(buff,"utf-8")); - 字节->字符
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
	 * 根据输入流，以文件流的形式下载文件
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
	 * PrintStream 写文件
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
	 * 利用StringBuffer写文件。可以设置文件编码
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
			sb.append("这是第"+i+"行:前面介绍的各种方法都不管用,为什么总是奇怪的问题 ");
			fos.write(sb.toString().getBytes("utf-8"));
		}
		fos.close();
	}
	
    /**
     * 文件重命名
     * @param path
     * @param oldName
     * @param newName
     */
    public static void renameFile(String path,String oldName,String newName){
    	if(!oldName.equals(newName)){
    		File oldFile = new File(path+"/"+oldName);
    		File newFile = new File(path+"/"+newName);
    		if(newFile.exists()){
    			System.out.print(newName+"已经存在");
    		}else{
    			oldFile.renameTo(newFile);
    		}
    	}
    }
    
    
    /**
     * 转移文件，更换目录
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
    				System.out.print(newPath+"已存在"+fileName);
    			}
    		}else{
    			oldFile.renameTo(newFile);
    		}
    	}
    }
    
    /**
     * 利用FileInputStream读取文件
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
     * 利用BufferedReader读取文件
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
//      br.readLine().getBytes("UTF-8");//-字符->字节
    	while(bfrline!=null){
    		sb.append(bfrline+" ");
    		bfrline = br.readLine();
    	}
    	br.close();
    	return sb.toString();
    }
    
    
    /**
     * 利用InputStreamReader读取输入流,并返回结果
     * InputStreamReader   - 字节流转换为字符流
     * @param is
     * @return
     * @throws IOException
     */
    public static String InputStreamReader(InputStream is) throws IOException{
    	Reader reader = new InputStreamReader(is);
    	int capacity = 1024;//输入内容的长度
        CharArrayBuffer buffer = new CharArrayBuffer(capacity);
     	char[] tmp = new char[1024];
    	int tempReader ;
    	if((tempReader = reader.read(tmp,0,tmp.length))!=-1){
    		buffer.append(tmp, 0, tempReader);
    	}
    	return buffer.toString();
    	
    }
    
    
    
    /**
     * 利用dom4j读取xml文件
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
// 		List rowList = null;  //获取指定路径下的元素列表,这里指获取所有的data下的row元素  
// 		Document document = null;
// 		document = saxreader.read(bufferedreader);
// 		rowList = document.selectNodes("/data/row");  
//		for(Iterator iter = rowList.iterator();iter.hasNext();){  
//			 //获得具体的row元素   
//			 Element element = (Element)iter.next();
//			 //获得row元素的所有属性列表  
//			 List elementList  = element.attributes();
//			 for(Iterator iter1 = elementList.iterator();iter1.hasNext();){  
//				 //将每个属性转化为一个抽象属性，然后获取其名字和值  
//	             AbstractAttribute aa = (AbstractAttribute)iter1.next(); 
//	             System.out.println("Name="+aa.getName()+"Value="+aa.getValue());
//			 }
//			 System.out.println(element.getName());  
//		     System.out.println(element.attributeValue("queryDTO.enterpriseId"));  
//		     //如果element下有子元素，(类似width="**")，要想获得该子元素的值，可以用如下方法  
//	         System.out.println(element.elementText("width"));//因为没有，所以输出为null。  
//		}
//		bufferedreader.close();
//        return document;
//    }
    
    /**
     * 创建文件夹
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
     * 创建新文件
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
     * 删除文件
     * @param path
     */
    public static void delFile(String path){
    	File file = new File(path);
    	if(file.exists()&&file.isFile()){
    		file.delete();
    	}
    }
    
    /**
     * 删除文件夹--递归删除该目录下的所有子目录和文
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
//			 File f2 = new File("c:/Users/user/Desktop/b.txt");	//注意c.txt里的内容是1234567890
//			 FileInputStream fis = new FileInputStream(f1);
//			 FileOutputStream fos = new FileOutputStream(f2,false);	//创建FileInputStream对象
//			 char ch;
//			 byte[] b = new byte[(int)f1.length()];
//			 int reader = fis.read(b,5,3);//read()方法是读取一个字节作为一个整数返回
//			 System.out.println(reader);
//			 for(int i=0;i<f1.length();i++)
//			 { 
//			 ch=(char)fis.read();//read()返回的是读入的一个字节所对应的int值
//			 fos.write(b[8]);	
//			 }
//			 System.out.println(b[7]);//这个b[7]打印出来的结果怎么会是51？？？ 
//			 fos.close();	//关闭
		 }catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
    }
	
	
}
