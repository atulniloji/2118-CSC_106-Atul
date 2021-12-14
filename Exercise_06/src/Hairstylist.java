
public class Hairstylist extends Staff {
	

	
	public Hairstylist(int staff_id,String name,String profession,  int salary) {
		super(staff_id,name,profession,salary);
		
	}
	
	public void displayHS()
	{
		System.out.println(staff_id + name + profession + salary);
	}
}
