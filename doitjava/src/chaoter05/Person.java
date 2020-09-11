package chaoter05;

public class Person {
	String name;
	int height;
	double gander;
	char gender;
	boolean married;
	
	public Person(String name, int height, double gander, char gender, boolean married) {
		this.name = name;
		this.height = height;
		this.gander = gander;
		this.gender = gender;
		this.married = married;
	}
	
	public Person () {
		this.name = "ȫ�浿";
		this.height = 180;
		this.gander = 75.5;
		this.gender = 'M';
		this.married = false;
	}
	
	void printName() {
		System.out.println(this.name);
	}
	
	void printight() {
		System.out.println(height);
	}
	
	void info() {
		printName();
		printHeight();
		
	}
}