package interfacepractice;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -99999;
	
	int add(int num1, int num2);                   //추상 메서드만 선언.
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	
}
