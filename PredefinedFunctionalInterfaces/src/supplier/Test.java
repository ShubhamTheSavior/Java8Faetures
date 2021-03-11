package supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		Supplier<String> s=()->{
			
			String[] s1=new String[] {"shubham","rushabh","mayur","kunal"};
			int i=(int) (Math.random()*4);
			return s1[i];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
		
		for(int i=0;i<1000;i++) {
			
			int n = 10000 + new Random().nextInt(90000);
				System.out.println(n);
		}
		
		
		
		
	}
}
