package chaoter05;

public class FunctionTest05 {

	public static void main(String[] args) {
		Obj obj = new Obj();
		int res = obj.add(1, 2);
		System.out.println(res);
	}

}

class Obj {
	int c = 10;
	int add(int a, int b) {		//��ǰ�� ��ġ�� ��� ����.
		return a + b + c;
	}
}