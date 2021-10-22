
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
//		Yani ortak methodları Person'da kullandık. (extends Person)
//		customer.age = 15;
//		employee.age = 20;

//		2. örneğimizde ise EmployeeManager ve CustomerManager yarattık ortak metodları add ve list'i PersonManager de kullandık ve extend PersonManager diye kullandık.
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();

//		customerManager.Add();
//		employeeManager.BestEmployee();

	}

}
