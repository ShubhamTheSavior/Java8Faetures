package predicates;


import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {
	
		Employee e1=new Employee("shuhbam",3000);
		
		
		Predicate<Employee> l=(Employee employee)->{
			if(employee.getSalary()>30000)
				return true;
			else
				return false;
		};
		
		System.out.println(l.test(e1));

	}

}
