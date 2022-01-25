package java0121;



public class ThreadExam {


	public static void useThread() {
		try {
			long startTime = System.currentTimeMillis();
			// 계산할 작업분리
			ThreadCore task1 = new ThreadCore(0, 50000000);
			Thread thread1 = new Thread(task1);
			ThreadCore task2 = new ThreadCore(50000001, 100000000);
			Thread thread2 = new Thread(task2);
			
			// 쓰레드가 하는일 : 프로세스를 여러개의 스레드가 나눠서 작업 
			//각각 쓰레드를 시작.
			thread1.start();
			thread2.start();
			
			// 각각 쓰레드 작업이 끝날때 까지 대기.
			thread1.join();
			thread2.join();
			
			System.out.println(task1.getSum() + task2.getSum());
			
			long endTime = System.currentTimeMillis();
			System.out.println("걸린시간 : "+(endTime - startTime));
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {

		// 쓰레드 : 프로세스 내의 자원을 사용해 실행되는 흐름의 단위
		
		// 프로세스 : 프로그램이 실행된 상태
		
		// 프로그램은 하나 또는 그 이상의 프로세스로 운영할 수 있다
		// 일반적인 자바 프로그램은 하나의 프로세스와 하나의 스레드로 운영
		
		// 최근 소프트웨어들 중에 멀티 스레드를 사용하는 경우도 많아졌다
		
		// 하나의 스레드를 사용해서 0부터 ~ 10억 까지의 짝수를 더하는 프로그램
		useThread();
		
		// 동기적 AjacKs
		// 이전 작업이 종료될 때까지 기다린 후
		// 다음 작업을 수행하는 것
		
		// 비동기적
		// 실행 명령만 내리고 다음 작업을 실행하는 것
		
		// 실습예제와 비교
		// 메인 스레드가 두 스레드를 생성하고 두 스레드를 실행시킨 후
		// 바로 밑에 있는 계산결과 출력하는 형태였음
		
		// 병렬적
		// 해당 시점에서 실행 흐름이 동시에 실행되는 것
		
		// 컴퓨터는 여러개의 CPU가 존재할 수 있다
		// CPU가 여러개가 존재하는 경우를 멀티 프로세서라고 부름
		// 다수의 프로세서가 협력적으로 일을 처리하는 것을 멀티 프로세싱이라 한다
		
		// core -> 동작하는 원리 -> 0,1을 계속 스위치해서 진동을 생성
		//						->클럭 클럭의 진동수를 Hz
		// 2.8Ghz(1초당 28억)
		
		// 하드웨어 쓰레드
		// cpu의 core내부의 스레드를 뜻한다
		// 1코어 ->1 스레드
		
		// 소프트웨어 스레드
		// 커널레벨 스레드
		// 유저레벨 스레드
		
		// 자바에서 스레드 사용
		// Java8 버전에서는 사용자 레벨 스레드 사용 안함
		// jvm을 통해 OS로 부터 시스템 콜을 호출
		// ->그 후 커널 스레드를 할당 받음
		
		
		
	}
	

}
