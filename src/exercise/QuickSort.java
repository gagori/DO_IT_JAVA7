package exercise;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] arr1) {
		System.out.println("QuickSort ascending");
		
	}

	@Override
	public void descending(int[] arr2) {
		System.out.println("QuickSort descending");
	}

	public void showInfo() {
		System.out.println("QuickSort 입니다.");
	}
}
