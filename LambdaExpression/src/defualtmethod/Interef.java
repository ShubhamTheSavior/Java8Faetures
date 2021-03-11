package defualtmethod;

public interface Interef {

	public void m1();
	default void m2() {
		System.out.println("shubham");
	}
}
