package com.huiy.Lambda.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author huiylove
 * @date 2019年3月28日
 */
public class Car {
	
    public static Car create( final Supplier< Car > supplier ) {
        return supplier.get();
    }              

    public static void collide( final Car car ) {
        System.out.println( "Collided " + car.toString() );
    }

    public void follow( final Car another ) {
        System.out.println( "Following the " + another.toString() );
    }

    public void repair() {   
        System.out.println( "Repaired " + this.toString() );
    }
    
    public static void main(String[] args) {
    	final Car car = Car.create(Car::new);//方法引用1  构造函数引用
    	final List< Car > cars = Arrays.asList(car);
    	cars.forEach( Car::collide);//方法引用2 静态方法引用
    	cars.forEach( Car::repair );//某个类的成员方法的引用
    	final Car police = Car.create( Car::new );
    	cars.forEach( police::follow );//某个实例对象的成员方法的引用
	}
    
}
