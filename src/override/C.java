package override;

import inheritance.A;

public class C {
	public void method(){
		//�ٸ���Ű�������� �ȵȴ�. ����ϸ�ȴ�
		A a = new A();
		a.field = "value";
		a.method();
	}
}
