//bizim �al��an�m�z hem workable hem eatable
public class Worker implements IWorkable, IEatable, IPayable{

	@Override
	public void work() {
		System.out.println("Bizim �al��an�m�z �al���r!");
		
	}

	@Override
	public void eat() {
		System.out.println("Bizim �al��an�m�z yemek hakk�!");
		
	}

	@Override
	public void pay() {
		System.out.println("Bizim �al��an�m�z maa��!");
		
	}

}
