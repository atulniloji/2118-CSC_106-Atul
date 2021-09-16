// Java program for implementation of Insertion Sort
class InsertionSort {
	public static void main(String args[])
	{
		System.out.println("\nINSERTION SORTING PROGRAM:");
		int data[]={1,4,6,2,5,2};
		System.out.println("Before Sort: ");
		for (int i=0;i<data.length;i++){
			System.out.print(" | " + data[i]);
		}

		for (int i=1;i<data.length;i++){
			int key = data[i];
			int j = i - 1;
			while (j >= 0 && key<data[j]) {
				data[j + 1] = data[j];
				j = j - 1;
			}
			data[j + 1] = key;
		}
		System.out.println("\nAfter Sort: ");
		for (int i=0;i<data.length;i++){
			System.out.print(" | " + data[i]);
		}
	}
}