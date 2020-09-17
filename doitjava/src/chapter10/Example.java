package chapter10;

public class Example {
	public static void main(String[] args) {
		Implementation impl = new Implementation();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceC ic = impl;
		ia.methodA();
		System.out.println();
	}

}
