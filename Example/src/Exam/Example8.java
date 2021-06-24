package Exam;

public class Example8 {

	public static void main(String[] args) {
		
		int[][] array= {{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum=0;
		double avg=0.0;
		int total=0;
		int tcount=0;
		
		//outter for
		int count=0;
		for(int i=0; i<array.length ; i++) { //행 3번 반복 0, 1, 2
			//inner for
			for(int j=0; j<array[i].length; j++) { //열 2반복,3반복,5반복
				  sum+=array[i][j];
				  count++;
			}
			avg=(double)sum/count;
			System.out.println("sum : "+sum);
			System.out.println("avg : "+avg);
			total +=sum; //초기화 전에 누적
			tcount+=count; //초기화 전에 누적 / 2, 3, 5 =10
			sum=0; //쓰레기값 비우기
			avg=0.0; //쓰레기값 비우기
			count=0; //쓰레기값 비우기
			System.out.println("---------------------");
		}
         System.out.println("==최종 총합과 평균==");
         double avgf=(double)total/tcount;
         
         System.out.println("sum : "+total);
         System.out.println("avg : "+avgf);
	}
}
