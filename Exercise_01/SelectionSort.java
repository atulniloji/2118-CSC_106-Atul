// Java program for implementation of Selection Sort
class SelectionSort
{
	public static void main(String args[])
	{
		System.out.println("\nSELECTION SORTING PROGRAM:");
		int data[]={1,4,6,2,5,2};
		System.out.println("Before Sort: ");
		for (int i=0;i<data.length;i++){
			System.out.print(" | " + data[i]);
		}

		for (int i=0;i<data.length;i++){
			int min=i;
			for (int j=i+1;j<data.length;j++){
				if(data[j]<data[min])
					min=j;
			}
			int temp=data[i];
			data[i]=data[min];
			data[min]=temp;
		}
		System.out.println("\nAfter Sort: ");
		for (int i=0;i<data.length;i++){
			System.out.print(" | " + data[i]);
		}
	}
}