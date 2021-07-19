package exercise;

public interface Sort {
	
	void ascending(int[] arr1);       //오름차순 정렬
	void descending(int[] arr2);		//내림차순 정렬
	
	public default void description() {         //디폴트 메서드
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
		
	}

}
