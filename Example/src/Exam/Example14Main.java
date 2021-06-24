package Exam;

import java.util.Scanner;

public class Example14Main {

	public static void main(String[] args) {
			
		Example14 ws=new Example14();
		
		String answer=ws.getAnswer(); //정답 반환 메서드 호출
		
		//가져온 단어를 섞어서 변수방에 넣기 즉 문제 생성
		String question=ws.getScrambledWord(answer);
		
		System.out.println("문제 : " + question); //섞어진 단어 출력
	
		
		while(true) {
			System.out.print("단어는? : ");
			Scanner scan= new Scanner(System.in);
			String str=scan.next();
			
			if(str.equalsIgnoreCase(answer)) {
				System.out.println(str + "정답!!");
				break;
			}else {
				System.out.println("오답....");
			}
		}
	}

}
