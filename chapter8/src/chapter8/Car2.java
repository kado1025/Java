package chapter8;

public class Car2 {
	String company="������";
	String model; // null
	String color; // null
	int maxSpeed; // 0
	//������ 1
	public Car2() {
			
	}
		
	//������ 2
	public Car2(String model) {
		this(model,"����",250);//������ 4 ȣ��
	}
		
	//������ 3
	public Car2(String model, String color) { 
		this(model,color,250); //������ 4 ȣ��
	}
		
	// ������ 4
	public Car2(String model, String color, int maxSpeed) { 		//���� ���� �ڵ�
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}	
}
