package chapter8_1;

public class Method_Test2 {

	public static void main(String[] args) {
		Car myCar= new Car();
		
		myCar.setGas(5); //Car�� setGas() �޼ҵ� ȣ��
		
		boolean gasState=myCar.isLeftGas();
		if(gasState) {
			System.out.println("car start.");
			myCar.run(); //Car�� run()�޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("no need to inject gas");
		}else {
			System.out.println("inject gas");
		}
		myCar.keyTrunOn();//��ü ���� �� �޼ҵ� ȣ��
		myCar.run2();
		int speed=myCar.getSpeed();
		System.out.println("current speed:"+speed+"km/h");
		}
}
