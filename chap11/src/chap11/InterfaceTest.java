package chap11;

interface PhoneInterface{
	final int TimeOut=10000;//상수필드
	void sendCall();//추상메소드
	default void printLogo() {
    System.out.println("**phone**");
	}//default 메소드
}

interface MobilePhone extends PhoneInterface { //인터페이스 상속
	void sendSMS();
	void receiveSMS();
}

interface MP3{ //인터페이스 선언
	public void play();
	public void stop();
}


class PDA{ //클래스선언
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SmartPhone extends PDA implements MobilePhone,MP3 {
	public void sendCall() {
		System.out.println("ring~ ring~");
	}
	public void sendSMS() {
		System.out.println("texting");
	}
	public void receiveSMS() {
		System.out.println("receive text");
	}
	
	public void play() {
		System.out.println("play music");
	}
	public void stop() {
		System.out.println("stop music");
	}
	public void schedule() {
		System.out.println("schedule management");
	}
	
	
	
}
public class InterfaceTest {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3 + 5 : "+phone.calculate(3,5));
		phone.schedule();
	}
}
