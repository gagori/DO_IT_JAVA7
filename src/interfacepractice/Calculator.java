package interfacepractice;

public abstract class Calculator implements Calc {           //인터페이스의 추상메서드를 구현하기.

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public void descripton() {
		System.out.println("더욱 정확한 계산기를 구현합니다.");
	}

	

}
