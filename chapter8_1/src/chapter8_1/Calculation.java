package chapter8_1;

public class Calculation {
	int plus (int x,int y) {
		int result=x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum=plus(x,y); //Ŭ���� ���ο��� �޼ҵ� ȣ�� (�޼ҵ� �̸������� ȣ���� �����ϴ�)
		double result=sum/2;
		return result;
	}
	
	void execute() {
		double result=avg(7,10);// Ŭ���� ���ο��� �޼ҵ� ȣ��
		println("execution result:"+result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
