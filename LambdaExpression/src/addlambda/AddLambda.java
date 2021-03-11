package addlambda;

public class AddLambda {
	
	public static void main(String[] args) {
		
		Interef i=(a,b)->System.out.println("Sum is : "+(a+b));
		i.add(10,20);
		i.add(101,201);
		i.add(1001,2001);
	}
}
