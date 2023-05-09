package chapter8_1;

public class Car {
	//필드 (멤버 변수)
	int gas;
	int speed;
	
	//생성자
	
	//메소드
	void setGas(int gas) { // 매개변수 없는 메소드 매개값 받아서 gas 필드값 변경
		this.gas=gas;
	}
	
	boolean isLeftGas() {// 리턴값이 boolean인 메소드
		if(gas==0) {
			System.out.println("no gas");
			return false;//false 리턴
		}
		System.out.println("has gas");
		return true; //true 리턴
	}
	
	void run() { //리턴값 없는 메소드 gas 값이 0이면 return 문으로 메소드 강제 종료
		while (true) {
			if (gas>0) {
				System.out.println("run.(remaining gas:"+gas+")");
				gas-=1;
			}else {
				System.out.println("stop.(remaining gas:"+gas+")");
				return;//메소드 실행 종료
			}
		}
	}
	
	int getSpeed() {
		return speed;
	}
	
	void keyTrunOn() {
		System.out.println("\nTurn the key");
	}
	
	void run2() {
		for(int i =10; i<=50; i+=10) {
			speed=i;
			System.out.println("run.(speed per hour:"+speed+"km/h)");
		}
	}
}
