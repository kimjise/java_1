package Exam;

import java.util.Random;
import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// 예) 416
		// 1~9 사이의 수를 입력하세요:
		/*
		 첫번쨰 수를 입력하세요 :4
		 두번쨰 수를 입력하세요 :5
		 세번쨰 수를 입력하세요 :6
		 2Strike 0Ball
		 
		 첫번쨰 수를 입력하세요 :7
		 두번쨰 수를 입력하세요 :8
		 세번쨰 수를 입력하세요 :9
		 OUT!!
		 
		 첫번쨰 수를 입력하세요 :1 (4)
		 두번쨰 수를 입력하세요 :6 (1)
		 세번쨰 수를 입력하세요 :5 (6)
		 0Strike 2Ball
		 
		 첫번쨰 수를 입력하세요 :4 (4)
		 두번쨰 수를 입력하세요 :1 (1)
		 세번쨰 수를 입력하세요 :6 (6)
		 0Strike 2Ball
		 
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		//컴퓨터가 발생할 난수 세 개
		int com1=0;
		int com2=0;
		int com3=0;
		//1에서 9까지의 난수 발생(Computer)
		do {
		com1=new Random().nextInt(9)+1;
		com2=new Random().nextInt(9)+1;
		com3=new Random().nextInt(9)+1;
		
		} while(com1 == com2  || com1==com3 || com2==com3);
		
		int user1=0;
		int user2=0;
		int user3=0;	
		
		while(true) {
			System.out.println("1~9 사이의 수를 입력하세요");
			System.out.print("첫번쨰의 수를 입력하세요:");
			user1=scan.nextInt();
			System.out.print("두번쨰의 수를 입력하세요:");
		    user2=scan.nextInt();
		    System.out.print("세번쨰의 수를 입력하세요:");
			user3=scan.nextInt();
			
			int strike=0;
			int ball=0;
			
			
			
			//만약에 사용자가 입력한 첫번쨰 play숫자와 com1이랑 같으면 : strike 1점 획득
			if(user1==com1) {
				strike++;}
			//user1를 기준으로 숫자는 맞지만 자리수가 다를경우 볼로 판정
		
			else if(user1==com2 || user1 ==com3) {
				ball++;
			}
			// ============================
			//만약에 사용자가 입력한 두번째 play 숫자와 com2가 같으면 : strike 1점 획득	
				if(user2==com2) {
					strike++;}
				//user1를 기준으로 숫자는 맞지만 자리수가 다를경우 볼로 판정
				else if(user2==com1 || user2 ==com3) {
					ball++;}
					
				if(user3==com3) {
						strike++;}
				//user1를 기준으로 숫자는 맞지만 자리수가 다를경우 볼로 판정
				else if(user3==com1 || user3 ==com2) {
					ball++;}
		//strike 3점이면 WIN!!출력후 종료
					
		//strike 0 || ball 0 OUT!!
					
					System.out.print(strike +" Strike ");
					System.out.println(ball +" ball");
					System.out.println("===================");
					
					if(strike==3) {
						System.out.print("WIN!!");
						break;
					}else if(strike==0&&ball==0) {
						System.out.print("OUT!!");
						break;
					}
		
					
					
					
					
					
		
		
		
		}
	
				
		
	}

}
