package sec02.exam10;

import java.util.Arrays;
import java.util.Scanner;

public class ex5_2_6Ex {

	public static void main(String[] args) {
		boolean run =true;
		int studentNum =0;
		int[] scores = null;
		
		//int[] scores = new int[10];
		//int[] scores;
		//scores= new int[10];
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------------");
			System.out.println("����> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo ==1) {
				System.out.println("�л���> ");
				int numStu = Integer.parseInt(sc.nextLine());
				scores = new int[numStu];	//��ü�����ؼ�, scores: �迭��� 			              
			
			}else if(selectNo == 2){
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> ");
					int scoreStu = Integer.parseInt(sc.nextLine());
					scores[i] = scoreStu;
//					System.out.println(scores[i]);
				}	
				
			}else if(selectNo ==3 ){
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> "+scores[i]);
				}				
				
			}else if(selectNo == 4){
				int max =0;
				double sum=0;
				double avg =0.0;
				
				Arrays.sort(scores);			//�������� ����
				max = scores[scores.length-1];  //���������̹Ƿ� �迭�� ������ ��
				
				for(int i = 0; i < scores.length; i++){
					sum += scores[i];
				}
				avg = (sum/(scores.length));
				
				System.out.println("�ְ�����: "+max);
				System.out.println("�������: "+avg);				
				
			}else if(selectNo == 5){
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
