
public class InsertionSort {
	public void sort(int array[]) {
		System.out.println("\nINSERTION SORTING PROGRAM:");
		System.out.println("Before Sort: ");
		print(array);
		for (int i=1;i<array.length;i++){
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && key<array[j]) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
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
