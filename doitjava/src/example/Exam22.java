package example;

import java.util.Scanner;

public class Exam22 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String isRepeat="y";
		 while(isRepeat.equals("y")) {
	         System.out.println("���ڸ� �Է��ϼ���.");
	         System.out.println("0-99 ������ ���ڸ� ������.");
	         int ans=(int)(Math.random()*100);  //���� �������� ���ϱ�, int�� ���� ����� ���� ������ ������ ������� 1~99������ ����� ����
	         int cnt=0, input, left=0, right=99;  //0~99������ ���� �����ϱ�
	
	         while(true) {         
	             cnt++;
	             System.out.print(cnt+">> ");
	             input=sc.nextInt();  //Scanner�� input���� �޾��ݴϴ�.
	             if(input==ans) {
	                break;  //���� ��(input)�� ����� ���ٸ� break�� ���� ������
	             }
	             else if(input>ans) {
	                if(input<=right) right=input-1;  // ���� ���� ���亸�� ũ�� right(�ʱⰪ:99)���� �۰ų� ���ٸ� right�� input���� 1 �۰� ����
	                System.out.println("�� ���� ���� �Է��Ͻÿ�. "+left+"-"+right);  //���亸�� ū ���� �־����� �� ���� ���� �Է��϶�� �����Ѵ�.         
	             }
	             else {
	                if(input>=left) left=input+1;  // ���������� ���� ���� ���亸�� �۰� left(�ʱⰪ:0)���� ũ�ų� ���ٸ� left�� input���� 1 ũ�� ����
	                System.out.println("�� ū ���� �Է��Ͻÿ�. "+left+"-"+right);  //���亸�� ���� ���� �־����� �� ū ���� �Է��϶�� �����Ѵ�.
	             }
	          }
	          System.out.println("�¾ҽ��ϴ�.");
	          System.out.print("�ٽ� �Ͻðڽ��ϱ�? (y/n)>> ");
	          isRepeat=sc.next();  // "y"�� �Է��ϸ� �ٽ�, "y"�̿��� ���ڸ� ������ ����
	       }
	       System.out.println("** ���� ���� **");
	    }
}