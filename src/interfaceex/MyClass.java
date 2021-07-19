package interfaceex;

public class MyClass implements MyInterface{

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.x();
		myClass.y();
		myClass.myMethod();
		
		X xClass = myClass;    //X로 형변환
		xClass.x();            //가능
//		xClass.y();				//불가능
//		xClass.myMethod();				//불가능
		
		
	}
	
}
