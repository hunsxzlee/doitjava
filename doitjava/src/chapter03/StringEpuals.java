package chapter03;

public class StringEpuals {

	public static void main(String[] args) {
		String str1 = "�ڹ�";    //�´� ǥ�õǴ� ���� ������ �ּҰ� �ٸ�
		String str2 = "�ڹ�"; 
		String str3 = new String("�ڹ�"); 
		
		System.out.println(str1 == str2);   //�ּ� �񱳽ÿ� �̷� �����ڸ� �̿�
		System.out.println(str2 == str3);
		System.out.println();
		System.out.println(str1.equals(str2));  //equals�� �� ���� ���Ĵ� ����
		System.out.println(str2.equals(str3));
		
	}

}
