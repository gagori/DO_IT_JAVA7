package exercise;

public class BubbleSort implements Sort {
	@Override
	public void ascending(int[] arr1) {
		System.out.println("BubbleSort ascending");
		
	}

	@Override
	public void descending(int[] arr2) {
		System.out.println("BubbleSort descending");
	}

	public void showInfo() {
		System.out.println("BubbleSort 입니다.");
	}

}
