package scheduleeer;

public interface Scheduler {
	
	void getNextCall();              // 다음 콜 받기
	void sendCallToAgent();          // 콜 넘겨주기

}
