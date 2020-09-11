package chaoter05;

public class CompanyTest {

	public static void main(String[] args) {
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1 == c2);  //같은 객체를 리턴 하였기에 트루로 나옴
	}
}