package example;

public class Overflow {
	public static void main(String[] args) {
		byte bNum = Byte.MAX_VALUE;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		int iNum = Integer.MAX_VALUE;			//�ִ밪 ���� �ø��� ���� �Ʒ���, �ּҰ� �Ʒ��� �������� ���� ���� �ö󰡴� ���� �����÷ο�
		System.out.println(iNum);
		iNum++;
		System.out.println(iNum);
		
		
	}

}
