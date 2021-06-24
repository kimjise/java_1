package Exam;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		// 키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		//입력받은 문자열에 소문자 a가 몇 개 있는지를 판별하는 로직 
		System.out.print("문자 입력:");
		Scanner scan = new Scanner(System.in);
		
		String str;
		int count=0;
		str=scan.next();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				count++;
			}else {
				continue;
			}
		}
		System.out.println("a의 개수" + count);
		
	}

}
