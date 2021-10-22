//bizim çalışanımız hem workable hem eatable
public class Worker implements IWorkable, IEatable, IPayable{

	@Override
	public void work() {
		System.out.println("Bizim çalışanımız çalışır!");
		
	}

	@Override
	public void eat() {
		System.out.println("Bizim çalışanımız yemek hakkı!");
		
	}

	@Override
	public void pay() {
		System.out.println("Bizim çalışanımız maaşı!");
		
	}

}
