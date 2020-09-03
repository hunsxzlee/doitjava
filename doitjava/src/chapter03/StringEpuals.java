package chapter03;

public class StringEpuals {

	public static void main(String[] args) {
		String str1 = "자바";    //셋다 표시되는 값은 같으나 주소가 다름
		String str2 = "자바"; 
		String str3 = new String("자바"); 
		
		System.out.println(str1 == str2);   //주소 비교시엔 이런 연선자를 이용
		System.out.println(str2 == str3);
		System.out.println();
		System.out.println(str1.equals(str2));  //equals는 두 값이 같냐는 물음
		System.out.println(str2.equals(str3));
		
	}

}
