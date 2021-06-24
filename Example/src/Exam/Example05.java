package Exam;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*키보드에서 두 수를 입력받아, 입력받은 두 수의 최대공약수 구하기
		예) 예)10와 4를 입력 : 10-> 2 5 10 / 4 -> 2 4
		   	  3과 7를 입력: 3 ->2 1 / 7 ->6 5 4 3 2 1	
		   	
		   			3 7 =21  3 6 9 12 15 18 21
		   					 7 14 21 */
		//변수
		Scanner scan = new Scanner(System.in);
		int n1=0;
		int n2=0;
		int temp=0;
		int i=0;
		//두수 스캔
		System.out.print("첫번쨰 숫자를 입력하세요 :");
		n1=scan.nextInt();
		System.out.print("두번쨰 숫자를 입력하세요 :");
		n2=scan.nextInt();
		//두수중에 큰 수를 추출
		if(n1>=n2) {
			temp=n2;
			
			}else {
				temp=n1;
			}
		for(i=temp; i>=1; i--) {
			if(n1 % i==0 && n2 % i==0) {
				break;
			}
		}
			
			//출력
			if(i==1) {
				System.out.println("최대공약수가 없습니다");
			}else {
				System.out.println(n1 + "과(와)"+ n2 +"의 최대공약수는 :" + i);
				
			}
		
			
			
			
			
		}
		
		//for(큰수 ; 1보다 작거나 같을때까지 ;i--)
		
	}
	



