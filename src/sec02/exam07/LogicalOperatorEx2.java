package sec02.exam07;

public class LogicalOperatorEx2 {

	public static void main(String[] args) {
		String sNum1 = "100";
		String sNum2 = "abc";
		
//		if (Integer.parseInt(sNum1)>50 | Integer.parseInt(sNum2)>300) {  //����! ��ΰ˻�, �ι��� �������� �ƴ϶� parse�� �ȵȴ�.
		 
		//&&  ||  -->  short circuit operator	�ΰ��� 1���� �˻��ص� �����ϸ�  ������ ���� ����.
		if (Integer.parseInt(sNum1)>50 || Integer.parseInt(sNum2)>300) {  //ó������ �˻��Ѵ�
			System.out.println("if�� �۵�");
		}
		System.out.println("���� ��������");		

	}

}
