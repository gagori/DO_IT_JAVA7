package bookshelf;

public interface Queue {                // 선입선출법
	void enQueue(String title);         // 들어가는 것. 추상 메서드로 구성.
	String deQueue();					// 맨 앞에것 꺼내는 것.
	int getSize();						// 전체 요소 몇개?

}
