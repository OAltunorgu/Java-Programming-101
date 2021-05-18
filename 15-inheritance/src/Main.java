
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		//Yani ortak Person'da kullandýk. (extends Person)

		//2. örneðimizde ise EmployeeManager ve CustomerManager yarattýk ortak olanlarý add ve list'i PersonManager de kullandýk ve extend PersonManager diye kullandýk.
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
//		customerManager.Add();
//		employeeManager.BestEmployee();
		
	}

}
