
public class BubbleSort {
	public void sort(int array[]) {
		System.out.println("\nBUBBLE SORTING PROGRAM:");
		System.out.println("Before Sort: ");
		print(array);
		for (int i=0;i<array.length;i++){
			for (int j=0;j<array.length;j++){
				if(array[i]<array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("After Sort: ");
		print(array);
		
	}
	
	public void print(int array[]) {
		for (int i=0;i<array.length;i++){
			System.out.print(" | " + array[i]);
		}
		System.out.println();
	}
}
