package sec02.exam10;

import java.util.Arrays;

public class ex5_2_4_ArraySort {

	public static void main(String[] args) {
		// for이용
		int max = 0;
		int[] array = {1,5,3,8,2};
//		for (int i = 0; i < array.length; i++) {
//			
//			array[i] > max? max=array[i]:array;
		
//			if (array[i] > max) {
//				max=array[i];
//			}
//		}		
//		System.out.println("max: "+max);

		Arrays.sort(array);   // 오름차순 정렬된다
		max = array[array.length-1];	//오름차순이므로 마지막 값
		System.out.println("최대값max: "+max);
	}

}
