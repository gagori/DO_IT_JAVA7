package interfacepractice;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 0;
		int num = 7;
		
//		Calc calculator = new Calculator           // 추상클래스인 Calc와 Calculator 를 인스턴스화 불가능.
		CompleteCalculator calculator = new CompleteCalculator();   //타입을 CompleteCalculator로 잡은 이유는 showInfo()가 보이기 위해.
		System.out.println(calculator.add(num1, num2));
		System.out.println(calculator.substract(num1, num2));
		System.out.println(calculator.times(num1, num2));
		System.out.println(calculator.divide(num1, num2));
		System.out.println(calculator.square(num));
		
		calculator.showInfo();
		
	}

}
