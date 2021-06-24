package Exam;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
/* 키보드에서 두 수를 입력받아, 입력받은 두 수의 최소공배수 구하기
예) 2와 5를 입력 : 2 4 6 8 10
   				5 10 15 20 25  => 10
   	3과 3를 입력: 3	
   	
   			3 7 =21  3 6 9 12 15 18 21
   					 7 14 21
   ====================================
   //변수
 */ //Scanner 객체
		Scanner scan = new Scanner(System.in);
		int n1=0;
		int n2=0;
		//안내문구와 함께 입력을 받음
		System.out.print("첫번쨰 숫자를 입력하세요 :");
		n1=scan.nextInt();
		System.out.print("두번쨰 숫자를 입력하세요 :5");
		n2=scan.nextInt();
		//최소공배수
		
		//반복문이용하고 그안에 if문으로 두수가 나누어 떨어질떄까지 반복
		int i=0;
		
		for(i=1; i<=n1*n2;i++) {
			if(i%n1==0 && i % n2==0)
				break;
		}
		System.out.println(n1 + "과(와)"+ n2 +"의 최소공배수는 :" + i);
	
		//방법2
		//while(true){
			//i++;
			//if(i % n1==0 i % n2 ==-)
				//break;
	
	}
	}
	
