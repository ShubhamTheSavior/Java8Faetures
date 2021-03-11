package defualtstaticlambda;

public class DefualtStaticLambda {
	
	public static void main(String[] args) {
		
		Interef i=(a,b)->System.out.println("Sum is : "+(a+b));
		i.add(10,20);
		i.m1();
		Interef.m2();
	}
}
