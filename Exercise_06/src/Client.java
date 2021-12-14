public class Client {

	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Mike" );
		Customer c2 = new Customer(2, "Ali" );
		Customer c3 = new Customer(3, "Anthony" );
		Customer c4 = new Customer(4, "Amar" );
	
		Customer userlist[] = {c1,c2,c3,c4};
		
		System.out.println("CUSTOMER DETAILS:");
		for(int i=0;i<userlist.length;i++)
		{
		
			userlist[i].displayuser();
	
		}
		System.out.println();
	
	
		//parameters(name,profession,salary,id)	
		MultiFuncStaff mfs1 = new MultiFuncStaff(101," Harry"," Attendant ",10000);
		MultiFuncStaff mfs2 = new MultiFuncStaff(102," Paul"," Cleaner ",7000);
		
		MultiFuncStaff[] MFSlist = {mfs1,mfs2};
		System.out.println("MULTI FUNCTIONAL STAFF DETAILS:");
		for(int j=0;j<MFSlist.length;j++)
		{
			MFSlist[j].displayMFS();
		}
		System.out.println();
		
		//parameters(name,profession,salary,id)
		Hairstylist HS1 = new Hairstylist (1," Hari"," Celebrity Specialist ",8000);	
		Hairstylist HS2 = new Hairstylist (2," Matt"," Ordinary ",10000);
	
		Hairstylist[] HS = {HS1,HS2};
	
		System.out.println("HAIRSTYLIST DETAILS:");
		for(int K=0;K<HS.length;K++)
		{
			HS[K].displayHS();
		}
	}

}
