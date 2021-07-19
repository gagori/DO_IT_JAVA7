package interfaceex;

public abstract class Calculator implements Calc  {       		// ,쉼표로 여러 인터페이스를 상속할 수 있다!! 왜냐? 인터페이스는 구현코드가 없고, 타입만 상속하기 때문!!
																//인터페이스를 상속받아 구현할 땐 implements.......cf) extends
																//여기선 일부 메서드만 구현하므로 해당 클래스도 abstract로 잡아줌.
																			// interface implements 는 타입 상속 : 인터페이스타입을 상속받았다.
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	
	     

	
}
