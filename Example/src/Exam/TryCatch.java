package Exam;

import javax.swing.JOptionPane;

public class TryCatch {
	
	public static void main(String[] args) {
		int num1 , num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
	
		
	try {
		System.out.println(num1/num2); //해당 작업을 구현
		
	} catch (ArithmeticException e) { //에러가 나면
		System.out.println("숫자 0을 입력하시면 안됩니다.");//에러시 수행될 행위
	}
	
	System.out.println("Error 후 컴파일=> 프로그램 수행 끝");
	
	
		

}
}
