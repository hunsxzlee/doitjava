package example;

public class Overflow {
	public static void main(String[] args) {
		byte bNum = Byte.MAX_VALUE;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		int iNum = Integer.MAX_VALUE;			//최대값 위로 올릴시 제일 아래로, 최소값 아래로 내려갈시 제일 위로 올라가는 것이 오버플로우
		System.out.println(iNum);
		iNum++;
		System.out.println(iNum);
		
		
	}

}
