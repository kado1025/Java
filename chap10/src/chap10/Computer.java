package chap10;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r ) {
		System.out.println("Excuting areaCircle() of the computer object.");
		return Math.PI*r*r;
	}

}
