package sec02.exam07;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {
		String[] strings = {"������","ȫ�浿","������","�̼���"};
		
			Arrays.sort(strings);		//����
			
//			for (int i = 0; i < strings.length; i++) {
//				System.out.println(strings[i]);
//			}
			
//		System.out.println(strings);	//   [Ljava.lang.String;@15db9742
		System.out.println(Arrays.toString(strings));	// [������, ������, �̼���, ȫ�浿] 
	}
}
