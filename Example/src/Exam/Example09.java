package Exam;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {

		boolean run = true;

		int studentNum = 0;
		int[] scores = null;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("===============================================");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("===============================================");
			System.out.print("����>");

			int selectNo = Integer.parseInt(scan.nextLine());

			if (selectNo == 1) {
				System.out.print("�л���>");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
			}
			else if(selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("�����Է�>");
					scores[i] = Integer.parseInt(scan.nextLine());
				}
			}
			else if(selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("�л�" + (i + 1) + " : " + scores[i]);
				}
			}
			else if(selectNo == 4) {
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}

				System.out.println("�հ�" + sum);
				double avg = 0;
				avg = (double) sum / studentNum;
				System.out.println("���" + avg);
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {
						max = scores[i];
						System.out.println("�ִ밪" + max);
					}
					
				}
				}else if(selectNo == 5) {
					run = false;
					System.out.println("���α׷� ����");
				}

			}
		}

	}

		


			




