
public class MultiFuncStaff extends Staff {

	public MultiFuncStaff(int staff_id,String name,String profession, int salary) {
		super(staff_id,name,profession, salary);
	}

	public void displayMFS() {
		// TODO Auto-generated method stub
		System.out.println(staff_id + name + profession + salary);
	}

}
