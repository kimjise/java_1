package Exam;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/* Scanner를 통해 정수 n을 입력받는다
		  그리고 1부터 입력받은 정수 n까지의 합을 계산하여
		  그 결과를 출력하시오.
		  ex) scan로 5를 입력 :1+2+3+4+5=15
		  */
		System.out.print("숫자를 입력하세요: ");
		Scanner scan = new Scanner(System.in);

 int n=scan.nextInt();
  int i=1;
  int sum=0;
 		for(i=1;i<=n;i++){
 			sum+=i;
 			}
 		System.out.print(sum);
	}
	}

