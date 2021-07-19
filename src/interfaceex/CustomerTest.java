package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer= new Customer();
		
		Buy buyer = customer;        //Customer 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입하여 형변환. buyer는 Buy 인터페이스의 메서드만 호출가능.
		buyer.buy();
		
		Sell seller = customer;      // seller는 Sell 인터페이스의 메서드만 호출가능.
		seller.sell();
		
		customer.order();        //고객 판매 주문 <<override 했기때문.
		buyer.order();			// 고객 판매 주문  <<?  "가상 메서드"        타입이 Buy 이지만, 현재 할당된 인스턴스가 Customer이므로!! Customer의 order가 불림.
		seller.order();			// 고객 판매 주문  <<?                              "
	}

}
