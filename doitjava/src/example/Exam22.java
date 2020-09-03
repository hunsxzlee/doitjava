package example;

import java.util.Scanner;

public class Exam22 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String isRepeat="y";
		 while(isRepeat.equals("y")) {
	         System.out.println("숫자를 입력하세요.");
	         System.out.println("0-99 사이의 숫자를 고르세요.");
	         int ans=(int)(Math.random()*100);  //정답 랜덤으로 정하기, int로 강제 선언시 뒤의 음수가 강제로 사라지며 1~99까지의 양수만 나옴
	         int cnt=0, input, left=0, right=99;  //0~99까지의 범위 설정하기
	
	         while(true) {         
	             cnt++;
	             System.out.print(cnt+">> ");
	             input=sc.nextInt();  //Scanner로 input값을 받아줍니다.
	             if(input==ans) {
	                break;  //넣은 값(input)이 정답과 같다면 break로 빠져 나오기
	             }
	             else if(input>ans) {
	                if(input<=right) right=input-1;  // 넣은 값이 정답보다 크고 right(초기값:99)보다 작거나 같다면 right를 input보다 1 작게 설정
	                System.out.println("더 작은 수를 입력하시오. "+left+"-"+right);  //정답보다 큰 값을 넣었으니 더 작은 수를 입력하라고 고지한다.         
	             }
	             else {
	                if(input>=left) left=input+1;  // 마찬가지로 넣은 값이 정답보다 작고 left(초기값:0)보다 크거나 같다면 left를 input보다 1 크게 설정
	                System.out.println("더 큰 수를 입력하시오. "+left+"-"+right);  //정답보다 작은 값을 넣었으니 더 큰 수를 입력하라고 고지한다.
	             }
	          }
	          System.out.println("맞았습니다.");
	          System.out.print("다시 하시겠습니까? (y/n)>> ");
	          isRepeat=sc.next();  // "y"를 입력하면 다시, "y"이외의 문자를 넣으면 종료
	       }
	       System.out.println("** 게임 종료 **");
	    }
}