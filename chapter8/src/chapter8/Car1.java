package chapter8;

public class Car1 {
	//�ʵ�
	String company="������";
	String model; // null
	String color; // null
	int maxSpeed; // 0
	
	//������ 1
	public Car1() {
		
	}
	
	//������ 2
	public Car1(String model) {
		this.model=model;
	}
	
	//������ 3
	public Car1(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	// ������ 4
	public Car1(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
