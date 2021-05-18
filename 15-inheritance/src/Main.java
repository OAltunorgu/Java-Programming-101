
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
//		Yani ortak methodlarý Person'da kullandýk. (extends Person)
//		customer.age = 15;
//		employee.age = 20;

//		2. örneðimizde ise EmployeeManager ve CustomerManager yarattýk ortak metodlarý add ve list'i PersonManager de kullandýk ve extend PersonManager diye kullandýk.
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
//		customerManager.Add();
//		employeeManager.BestEmployee();
		
	}

}
