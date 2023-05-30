package chap11;

abstract class Sachik{
	abstract void draw();
	abstract void computerArea(double a,double b);
	
}

class Rectangle1 extends Sachik{
	void draw() {
		System.out.println("Plus");
	}
	void computerArea(double h, double v) {
		System.out.println("Result = "+(h*v));
	}
	
}

class Triangle1 extends Sachik{
	void draw() {
		System.out.println("Minus");
	}
	void computerArea(double a,double h) {
		System.out.println (" 삼각형의 넓이:"+(a*h/2));
	}
}
public class Test2 {

	public static void main(String[] args) {
		System.out.println("Computation");
		s= new Rectangle1();
		s.draw();
		s.computerArea(5.0,10.0);
		s=new Triangle1();
		s.draw();
		s.computerArea(5.0,10.0);
	}

}
