
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
//		Yani ortak methodlar� Person'da kulland�k. (extends Person)
//		customer.age = 15;
//		employee.age = 20;

//		2. �rne�imizde ise EmployeeManager ve CustomerManager yaratt�k ortak metodlar� add ve list'i PersonManager de kulland�k ve extend PersonManager diye kulland�k.
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
//		customerManager.Add();
//		employeeManager.BestEmployee();
		
	}

}
