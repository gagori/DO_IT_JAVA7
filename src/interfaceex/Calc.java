package interfaceex;

public interface Calc {                     //인터페이스로 지정하면 아래 메서드들은 abstract로 지정 안해도됨.
	
	public static final double PI = 3.14;                       //얘네들은 아무런 키워들을 쓰지 않아도. 상수(Static), 이텔릭체, final.  인터페이스 특.
	int ERROR = -999999999;
	
	
	public abstract int add(int num1, int num2);     //이렇게 안 써도 됨. 프리컴파일 단계에서 자동 생성됨.
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {                      //디폴트 메서드
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	
	
	static int total(int[] arr) {                      //정적 메서드 : 인스턴스의 생성과 상관없이 사용할 수있다. 인터페이스 이름으로 직접 참조하여 사용.
		int total = 0;
		
		for(int i : arr) {           //향상된 for문, i가 arr의 요소를 돌면서 모두 합해줌.
			total += i;
		}
		return total;
	}

}
