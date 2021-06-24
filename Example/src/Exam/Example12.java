package Exam;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		
		
		/*  
		 학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		 프로그램을 실행하면 몇 명의 정보를 저장 할 것인지를 입력받은 후,
		 입력받은 수 만큼 학생들의 이름과 수학성적, 영어성적을 입력받는 프로그램 작성 
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("등록할 인원수 : ");
		int num = scan.nextInt();
		String Str[][]= new String[num][3];
		
		for(int i =0; i < Str.length;i++) {
			System.out.print("이름: ");
			Str[i][0] = scan.next();
			
			System.out.print("수학: ");
			Str[i][1] = scan.next();
			
			System.out.print("영어: ");
			Str[i][2] = scan.next();
			
		}
		
		System.out.println(Str.length + "명 등록완료!");
		for(int i = 0; i<Str.length;i++) {
			
			for(int j = 0; j < Str[i].length;j++) {
				System.out.println(Str[i][j] + " ");
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
