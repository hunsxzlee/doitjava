package example;

public class ArrayEx01 {

	public static void main(String[] args) {
		char[] cArr = new char[26];
		cArr[0] = 'a';  //97
		cArr[1] = 'b';	//98
		cArr[2] = 'c';	//99
		
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = (char)('a' + i);  //형변환 없이 그냥 하면 int로 초기화가 되니 char로 형변환을 해줘야 함
		}
		
		System.out.println(cArr);
	}
}