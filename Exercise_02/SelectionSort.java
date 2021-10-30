
public class SelectionSort {
	public void sort(int array[]) {
		System.out.println("\nSELECTION SORTING PROGRAM:");
		System.out.println("Before Sort: ");
		print(array);
		
		for (int i=0;i<array.length;i++){
			int min=i;
			for (int j=i+1;j<array.length;j++){
				if(array[j]<array[min])
					min=j;
			}
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
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
