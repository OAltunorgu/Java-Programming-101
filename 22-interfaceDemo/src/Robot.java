
public class Robot implements IWorkable,IMaintainable{

	@Override
	public void work() {
		System.out.println("Robot çalýþanýmýz çalýþýr!");
		
	}

	@Override
	public void maintainable() {
		System.out.println("Robot çalýþanýmýz bakým!");
		
	}

}
