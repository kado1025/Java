package chapter8;

public class CarTest {

	public static void main(String[] args) {
		// ��ü ����
		Car myCar=new Car();
		
		//�ʵ尪 �б�
		System.out.println("����ȸ��:" +  myCar.company);
		System.out.println("�𵨸�:" + myCar.model);
		System.out.println("����ӵ�:" + myCar.speed); //������ �� ���
		
		//�ʵ尪 ���� 
		myCar.speed=60;
		System.out.println("�����ȼӵ�:" + myCar.speed);


	}

}
