
public class MainApp {

	public static void main(String[] args) {
		System.out.println("OO Sort");
		int data[]={1,4,6,2,5,2};
		BubbleSort bsort = new BubbleSort();
		bsort.sort(data);
		
		InsertionSort isort = new InsertionSort();
		isort.sort(data);
		
		SelectionSort ssort = new SelectionSort();
		ssort.sort(data);
	}

}
