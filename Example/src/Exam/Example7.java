package Exam;

public class Example7 {
	
	public static void main(String[] args) {
		int max=0;
		
		int[] array= {1,5,8,2,5};
		
		//최대값 알고리즘
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max=array[i];
			}
		}
		System.out.println("최대값 : "+max);
	}

}
