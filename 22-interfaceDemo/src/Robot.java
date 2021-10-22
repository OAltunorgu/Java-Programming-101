
public class Robot implements IWorkable,IMaintainable{

	@Override
	public void work() {
		System.out.println("Robot çalışanımız çalışır!");
		
	}

	@Override
	public void maintainable() {
		System.out.println("Robot çalışanımız bakım!");
		
	}

}
