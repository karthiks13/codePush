package Polymorphism;

public class OverloadingExample {
	

	public static void main(String[] args) {
		
		OverloadingExample obj = new OverloadingExample();
		//obj.add(a, b, c);
		obj.doLogin("asdlfjsladf", "asldfjdas");
		obj.add(1,2);
		byte b1=10;
		byte b2=20;
		obj.add(1,2);
		
	}
	
	public void add(int a, int b) {
	
		
	}
	
	public void add(int a, double var) {
		
		
	}
	
	public void add(double var, int a) {
		
		
	}
	
	public void add(byte a, byte b) {
		
	}
	
	public void add(int a, int b, int c) {
		
		
	}
	
	public void doLogin (String username,String password) {
		
	}
public void doLogin (int mobilenumber,String password) {
		
	}
	
}
