package scheduleeerpractice;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");

		int ch = System.in.read();           //할당 방식을 "입력"받아 ch변수에 대입.
		Scheduler scheduler = null;          //초기화 해주고 아래 조건문에서 인스턴스 결정.
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if (ch=='L'|| ch=='l') {
			scheduler = new LeastJob();
		}
		else if (ch =='P' || ch =='p') {
			scheduler = new PrioirtyAllocation();
		}
		else if (ch =='A'|| ch =='a') {
			scheduler = new AgentGetCall();
		}
		
		else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		scheduler.getNextCall();                  //다형성.
		scheduler.sendCallToAgent();
		
		
	}

}
