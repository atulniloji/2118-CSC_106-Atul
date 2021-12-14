
public class Customer extends User {
	
	int cust_id;
	
	public Customer(int cust_id,String name) {
		super(name);
		this.cust_id = cust_id;
	}

	public void displayuser()
	{
		System.out.println(cust_id + "."+name);
	}
}
	

