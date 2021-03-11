package finctions;

import java.util.function.Function;

import predicates.Employee;

public class Test {

	
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("shuhbam",30000);
		
		Function<String,Integer> f=s->s.length();
		System.out.println(f.apply("shubham"));
		System.out.println(f.apply("rushu"));

		Function<Employee,String> f1=s->{
			if(s.getSalary()>3000) 
				return s.getName()+" is having salary : "+s.getSalary();
			else
				return null;
		};
		System.out.println(f1.apply(e1));
		
	}

}
