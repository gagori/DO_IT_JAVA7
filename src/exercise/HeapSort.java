package exercise;

public class HeapSort implements Sort {
	@Override
	public void ascending(int[] arr1) {
		System.out.println("HeapSort ascending");
		
	}

	@Override
	public void descending(int[] arr2) {
		System.out.println("HeapSort descending");
	}

	@Override
	public void description() {              				//재정의
		Sort.super.description();
		System.out.println("HeapSort 입니다.");
	}
}
