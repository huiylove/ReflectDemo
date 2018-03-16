package com.huiy.javaimprove.anonymousinnerclass;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2016年12月22日
 * @version 1.0
 *对于匿名内部类的使用它是存在一个缺陷的，就是它仅能被使用一次，
 *创建匿名内部类时它会立即创建一个该类的实例，该类的定义会立即消失，
 *所以匿名内部类是不能够被重复使用
 *
 */
public class Test {
	
//	public Test(Bird bird){
//		System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");  
//	}
      
    public void test(Bird bird){  
		System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");  

    }
    
    public void testFly(CanFly fly){  
		System.out.println("怎么飞:"+fly.fly());  

    }
    
    public static void main(String[] args) {  
        Test test = new Test();
        test.test(new Bird() {  
            
              @Override
			public int fly() {  
            	  return 10000;  
              }  
	            
	          @Override
			public String getName() {  
	              return "大雁";  
	          }
         });
        
        test.testFly(new CanFly(){
        	
        	@Override
			public String fly() {  
          	  return "用翅膀飞";  
            } 
        });
    }
}
