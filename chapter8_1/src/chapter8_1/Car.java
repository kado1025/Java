package chapter8_1;

public class Car {
	//�ʵ� (��� ����)
	int gas;
	int speed;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) { // �Ű����� ���� �޼ҵ� �Ű��� �޾Ƽ� gas �ʵ尪 ����
		this.gas=gas;
	}
	
	boolean isLeftGas() {// ���ϰ��� boolean�� �޼ҵ�
		if(gas==0) {
			System.out.println("no gas");
			return false;//false ����
		}
		System.out.println("has gas");
		return true; //true ����
	}
	
	void run() { //���ϰ� ���� �޼ҵ� gas ���� 0�̸� return ������ �޼ҵ� ���� ����
		while (true) {
			if (gas>0) {
				System.out.println("run.(remaining gas:"+gas+")");
				gas-=1;
			}else {
				System.out.println("stop.(remaining gas:"+gas+")");
				return;//�޼ҵ� ���� ����
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
