package defualtstaticlambda;

@FunctionalInterface
public interface Interef {

	void add(int m1,int m2);
	
	default void m1() {
		System.out.println("default method");
	}
	
	static void m2() {
		System.out.println("Static Method");
	}
	
}
