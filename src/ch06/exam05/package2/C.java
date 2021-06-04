package ch06.exam05.package2;

import ch06.exam05.package1.A;

public class C {
	
	public C(){
		A a = new A();
	a.field1 =1;
//	a.field2 =1;	//err.  default 같은 pkg내
//	a.field3 =1;	//err. private 같은 class내

	a.method1();
//	a.method2();	//err.  default 같은 pkg내
//	a.method3();	//err. private 같은 class내
	}
}
