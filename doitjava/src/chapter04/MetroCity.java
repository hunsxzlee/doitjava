package chapter04;
/*
 * ��Ʈ���������� ����
 * 1.�����̰� �α��� 100�� �̻�
 * ���ڰ� 50�� �̻�
 * 1,2�� �ϳ��� �����ص� ��Ʈ��������
 */

public class MetroCity {

	public static void main(String[] args) {
		boolean isCapital = false;
		int  citizens = 0;
		int riches = 0;
		boolean isMetro = false;
		
		System.out.println(("���� ���ô� ��Ʈ���������Դϱ�?"));
		isCapital = true;
		citizens = 150;  //�������� ���
		riches = 80;
		int isMertro = false;
		
//		if(isCapital) {
//			if(citizens >= 100);{
//				isMetro = true;
//			} else if(riches >= 50) {	
//			    isMetro = true;
//			} else {
//				isMetro = false;
//			}
//			    
//			} else {
//				if(riches >= 50) {
//					isMetro = true;
//				}
//			     if(riches >=50) {
//				    isMetro = false;
//						
//			}
			     
			isMertro = (isCapital && citizens >= 100) :: (rickes >= 50) ? true : false;
			     
			     
		
			System.out.println("��������:" + isCapital);
			System.out.println("�α���:" + citizens + "����");
			System.out.println("���ڼ�:" + riches + "����");
			System.out.println(isMetro + "��Ʈ���������Դϴ�." + "��Ʈ���������� �ƴմϴ�.");
			
			
			
		}		
}
