package com.huiy.javaimprove.abstrctandinterface;

/**
 * @author huiylove
 * @date 2019年3月28日
 */
public class ClassExt extends AbstractClass implements ActionInterface{

	public ClassExt(){
	}
	
	public ClassExt(int x){
		super(x);
	}
	
	@Override
	public void fly() {
		
	}

	@Override
	public void A() {
		
	}
	
	
	public static void main(String[] args) {
		AbstractClass ext = new ClassExt();
		System.out.println(ext.a);
	}

	@Override
	protected void B() {
	}

}
