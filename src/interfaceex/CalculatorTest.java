package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();            //업캐스팅
//		Calc calc1 = new Calc();                     //인터페이스는 인터페이스화 못함. 당연히 new 못함.
//		Calc calc = new Calculator();				//추상 클래스이므로 당연히 new 못함.
		
//		calc.showInf0                            // showInfo안보인다. 타입이 Calc이므로 Calc클래스에서 선언된 메서드만 호출됨. 이때 쓰고싶다면 "다운캐스팅" 필요
		calc.description();
		
		
		CompleteCalc calc2 = new CompleteCalc();     //이렇게는 될 수 있다.
		calc2.showInfo();                            //showInfo 보인다. 타입이 CompleteCalc이므로 여기서 선언된 메서드 쓸 수 있다.
		
		
		
		Calculator calc3 = new CompleteCalc();      //업캐스팅,  타입이 여러개 될 수 있다. 상속관계 생각!
				
			
		
		
		
		System.out.println(calc.add(num1, num2));
		
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(Calc.total(arr));

	}

}
