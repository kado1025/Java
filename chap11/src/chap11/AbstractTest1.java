package chap11;

abstract class Shape1{
	abstract void draw();
	abstract void computerArea(double a,double b);
	
}

class Rectangle1 extends Shape1{
	void draw() {
		System.out.println("사각형 그리기");
	}
	void computerArea(double h, double v) {
		System.out.println("사각형의 넓이:"+(h*v));
	}
	
}

class Triangle1 extends Shape1{
	void draw() {
		System.out.println("삼각형 그리기");
	}
	void computerArea(double a,double h) {
		System.out.println (" 삼각형의 넓이:"+(a*h/2));
	}
}
public class AbstractTest1 {

	public static void main(String[] args) {
		System.out.println("추상 메소드 이용한 다형성");
		Shape1 s= new Rectangle1();
		s.draw();
		s.computerArea(5.0,10.0);
		s=new Triangle1();
		s.draw();
		s.computerArea(5.0,10.0);
		

	}

}
