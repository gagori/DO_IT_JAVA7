package scheduleeer;

import java.io.IOException;

public class ScheduleTest {
	
	public static void main(String[] args) throws IOException {
	
		//R, L, P 입력받기.
		System.out.println("전화 상담 배분방식을 선택하시오.  (R ,L, P)");
		
		int ch = System.in.read();               // 입력받기!!!
		Scheduler scheduler = null; 			//스케쥴러 타입의 변수를 만들고,  null로 초기화
		
		if (ch == 'R'||  ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if (ch =='L'|| ch == 'l') {
			scheduler = new LeastJob();
		} 
		else if (ch =='P'|| ch == 'p') {
			scheduler = new PriorityAllocation();
		} 
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();                             //다형성 : 똑같은 메서드를 불렀지만, 각 인스턴스에 따라서 구현이 다양하게됨.
		scheduler.sendCallToAgent();
		
	}
	
	
}
