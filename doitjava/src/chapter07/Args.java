package chapter07;

public class Args {

	public static void main(String[] args) {
//		args = {}; ���� �Է����� �ʾƵ� �ڵ����� �����Ǵ� ��
		        if (args.length != 0) {
		            for(int i=0; i<args.length; i++) {
		    System.out.println(args[i]);
		        }
		    } else {
		    	System.out.println("�Է��� �Ű������� �����ϴ�.");
		}
	}
}