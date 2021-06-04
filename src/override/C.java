package override;

import inheritance.A;

public class C {
	public void method(){
		//다른패키지에서는 안된다. 상속하면된다
		A a = new A();
		a.field = "value";
		a.method();
	}
}
