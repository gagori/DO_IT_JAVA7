package interfaceex;

public class Customer implements Buy, Sell {       //두 인터페이스를 모두 implements한다.

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void order() {                      //Buy와 Sell의 default메서드 이름이 동일하여 오류생기므로, override 필요.
		
		System.out.println("고객 판매 주문");
	}

}
