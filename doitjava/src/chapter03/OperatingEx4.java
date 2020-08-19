package chapter03;

public class OperatingEx4 {

	public static void main(String[] args) {
		int fatherAge = 45;
		int	motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';

		System.out.println(ch);
		
		int num = 15;
		boolean isEven;
		isEven = ((num % 2) == 0) ? true : false;
		System.out.println("Â¦¼öÀÎ°¡¿ä?" + (isEven?"Â¦¼ö" : "È¦¼ö"));
		
	}

}
