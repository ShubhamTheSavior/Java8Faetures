package defualtmethod;

public class Test implements Interef {

	@Override
	public void m1() {
		System.out.println("overrrided");

	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		t.m2();
	}

}
