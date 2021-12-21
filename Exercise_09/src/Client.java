
public class Client{

	public static void main(String[] args) {
		
		Simple S= new Simple();
		System.out.println("SIMPLE CALCULATOR :\n");
		S.add(30,20);
		S.subract(30,20);
		S.multiply(30,20);
		S.divide(30,20);
		System.out.println("\n");
		
		Advanced A = new Advanced();
		System.out.println("ADVANCED CALCULATOR :\n");
		A.add(30, 5);
		A.subract(30, 5);
		A.multiply(30, 5);
		A.divide(30, 5);
		A.modulus(30, 7);
		A.square(15);
		A.sqrt(64);
		A.add(20,30,40);
	}

}
