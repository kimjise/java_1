package Exam;

import java.util.Scanner;

public class NumMagic {

	public static void main(String[] args) {
		String select; //yes or no를 선택하기 위한 변수
		int result=0; //사용자가 생각한 숫자를출력
		
		System.out.println("1~30 사이의 숫자를 머리속으로 생각하세요");
		
		System.out.println("04 05 06 07 12");
		System.out.println("13 14 15 20 21");
		System.out.println("22 23 28 29 30");
		
		System.out.println("여기에 당신이 생각한 숫자가 있습니까? y | n : ");
		Scanner scan =new Scanner(System.in);
		select=scan.next();
		
		if(select.equals("y"))
			result += 16;
		System.out.println("---------------------------------");
		System.out.println("16 17 18 19 20");
		System.out.println("21 22 23 24 25");
		System.out.println("26 27 28 29 30");
		
		
		if(select.equals("y"))
			result += 1;
		System.out.println("---------------------------------");
		System.out.println("08 09 10 11 12");
		System.out.println("13 14 15 24 25");
		System.out.println("26 27 28 29 30");
		
		if(select.equals("y"))
			result += 8;
		System.out.println("---------------------------------");
		System.out.println("02 03 06 07 30");
		System.out.println("10 11 14 15 18");
		System.out.println("19 22 23 26 327");
		
		System.out.println("---------------------------------");
		System.out.println("여기에 당신이 생각한 숫자가 있습니까? y | n : ");
		select=scan.next();
		if(select.equals("y"))
			result += 2;
		
	}	
	}


