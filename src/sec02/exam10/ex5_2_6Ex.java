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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo ==1) {
				System.out.println("학생수> ");
				int numStu = Integer.parseInt(sc.nextLine());
				scores = new int[numStu];	//객체생성해서, scores: 배열밴수 			              
			
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
				
				Arrays.sort(scores);			//오름차순 정렬
				max = scores[scores.length-1];  //오름차순이므로 배열의 마지막 값
				
				for(int i = 0; i < scores.length; i++){
					sum += scores[i];
				}
				avg = (sum/(scores.length));
				
				System.out.println("최고점수: "+max);
				System.out.println("평균점수: "+avg);				
				
			}else if(selectNo == 5){
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
