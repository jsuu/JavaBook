package ch06.exam05.package2;

import ch06.exam05.package1.A;

public class C {
	
	public C(){
		A a = new A();
	a.field1 =1;
//	a.field2 =1;	//err.  default ���� pkg��
//	a.field3 =1;	//err. private ���� class��

	a.method1();
//	a.method2();	//err.  default ���� pkg��
//	a.method3();	//err. private ���� class��
	}
}
