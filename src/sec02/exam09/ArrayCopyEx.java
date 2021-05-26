package sec02.exam09;

public class ArrayCopyEx {
	//oldStrArray 값을  newStrArray에 삽입
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy","abc"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray,1, newStrArray, 0, oldStrArray.length-1);
//		System.arraycopy(src, src 시작인덱스, dest, dest 시작인덱스, 넣어야할 length);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]+ ", ");
		}

	}

}
