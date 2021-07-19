package bookshelf;

public class BookShelf extends Shelf implements Queue{              //구현할 인터페이스느 Queue이고, Shelf를 상속받음.

	@Override
	public void enQueue(String title) {  //맨 뒤로 들어감 add
		shelf.add(title);
	}

	@Override
	public String deQueue() {		//맨 앞에서 꺼내기
//		get은 리스트에 요소가 남아있고 참조만 하는것.
//		우리는 꺼내와야함.                               remove
		return shelf.remove(0);             //맨 앞에꺼 나옴 (0번째)
		
	}

	@Override
	public int getSize() {

		return getCount();
	}

	public static void main(String[] args) {                //테스트 코드
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥1");
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		
		System.out.println(shelfQueue.deQueue());         //맨 앞 태백산맥1
		System.out.println(shelfQueue.deQueue());		// 그다음 태백산맥2 꺼내옴.
		System.out.println(shelfQueue.deQueue());		// 그다음 태백산맥3 꺼내옴.
		
	}

}

