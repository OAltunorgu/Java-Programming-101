
public class Robot implements IWorkable,IMaintainable{

	@Override
	public void work() {
		System.out.println("Robot �al��an�m�z �al���r!");
		
	}

	@Override
	public void maintainable() {
		System.out.println("Robot �al��an�m�z bak�m!");
		
	}

}
