package chapter07;

public class Args {

	public static void main(String[] args) {
//		args = {}; 굳이 입력하지 않아도 자동으로 생성되는 식
		        if (args.length != 0) {
		            for(int i=0; i<args.length; i++) {
		    System.out.println(args[i]);
		        }
		    } else {
		    	System.out.println("입력한 매개변수가 없습니다.");
		}
	}
}