
public class MySqlCustomerDal implements ICustomerDal, IRepository{
//Classlar birden fazla interfaces implement edebilir.
	
	@Override
	public void Add() {
		System.out.println("My sql eklendi!");
	}

}
