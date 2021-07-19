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

	@Override
	public void description() {              				//재정의
		Sort.super.description();
		System.out.println("QuickSort 입니다.");
	}
}
