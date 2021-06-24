package Exam;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		/*키보드에서 수를 입력받아, 그 숫자가 소수인지 아닌지를 판별하시오
		 * 소수 : 1과 자기자신 이외는 다른 숫자와 나누어 떨어지지 않는 수
//알고리즘 : (1는제외)
		예) 예) 7 : 2 3 4 5 6 7
		11 : 2 3 4 5 6 7 8 9 10 11
		//============================*/
		
		//변수선언
		int n1=0;
		int i=0;
		
		//스캔
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번쨰 숫자를 입력하세요 :");
		n1=scan.nextInt();
		
		 //for 구현
		  for(i=2;i<=n1;i++) {
			  if(n1%i==0){
				  break;
			  }
		  }//if 구현
			  if(i==n1) {
				  System.out.println(n1 + "은(는) 소수 입니다");
			  }else {
				  System.out.println(n1 + "은(는) 소수가 아닙니다");
			  }
		  }
		  
	
		
	
	} 
		


