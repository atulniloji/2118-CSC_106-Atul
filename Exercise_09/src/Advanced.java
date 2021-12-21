public class Advanced extends Calculator{
	
	@Override
	public int add(int x, int y) {
		int z=x+y;
		System.out.println("Addition in Advanced calcultor = " +z);
		return z;
	}

	@Override
	public int subract(int x, int y) {
		int z=x-y;
		System.out.println("Subraction in Advanced calcultor = " +z);
		return z;
	}

	@Override
	public int multiply(int x, int y) {
		int z=x*y;
		System.out.println("Addition in Advanced calcultor = " +z);
		return z;
	}

	@Override
	public int divide(int x, int y) {
		int z=x/y;
		System.out.println("Division in Advanced calcultor = " +z);
		return z;
	}
	
	public int modulus(int x,int y) {
		int z=x%y;
		System.out.println("Modulus in Advanced calcultor = " +z);
		return z;
	}
	
	public int square(int x) {
		int z=x*x;
		System.out.println("Square in Advanced calcultor = " +z);
		return z;
	}
	
	public double sqrt(int x) {
		double z= Math.sqrt(x);
		System.out.println("Square root in Advanced calcultor = " +z);
		return z;
	}
	
	 public int add(int x,int y, int w)
	 {
		 int z = x + y + w;
		 System.out.println("Addition in Advanced calcultor = " +z+" (3 Variables)");
		 return z;
	 }

}





// polymorphism

