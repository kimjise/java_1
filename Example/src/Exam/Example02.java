package Exam;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		///* Scanner를 통해 정수 n1, n2을 입력받는다
		//그리고 n1부터 n2까지의 합을 계산하여 그 결과를 출력하시오.
		//ex)scan로 5,2를 입력 : 2+3+4+5의 출력결과 13을 콘솔에 출력하시오.
		
		//변수선언
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째수를 입력하세요:");
		int n1=scan.nextInt();
		System.out.print("두번째수를 입력하세요:");
		int n2=scan.nextInt();
		
		//혹시 큰수가 n1에 입력되면 스왑을 이용하여 작은수가 n1에 오도록...
	
		if(n1>n2) {
			int temp;
			temp=n1;
			n1=n2;
			n2=temp;
			
			int sum;
			sum=0;
			int i;
			for(i=n1;i<=n2;i++) {
				sum+=i;}
			System.out.print(sum);
			
		}
		else {
			int sum;
			sum=0;
			int i;
			for(i=n1;i<=n2;i++) {
				sum+=i;
			}
			System.out.print(sum);
		}
		
			
		//for문을 이용하여 합을 구함
		
	
	}

}
