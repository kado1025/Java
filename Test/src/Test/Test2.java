package Test;

import java.util.Scanner;

abstract class Calculator{
	public abstract int add(int a,int b);//덧셈
	public abstract int sub(int a, int b);//뺄셈
	public abstract int gob(int a, int b);//곱셈 
	public abstract int nanum0(int a, int b);//나눗셈
}

class Sachik extends Calculator{
	@Override
	public int add(int a,int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int gob(int a, int b) {
		return a*b;
	}

	@Override
	public int nanum0(int a, int b) {
		return a/b;
	}
}

public class Test2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Sachik s= new Sachik();
		System.out.print("Input First number : ");
		int a =stdin.nextInt();
		System.out.print("Input Second number : ");
		int b =stdin.nextInt();
		System.out.println("add : "+s.add(a,b));
		System.out.println("sub : "+s.sub(a,b));
		System.out.println("gob : "+s.gob(a,b));
		System.out.println("nanum : "+s.nanum0(a,b));

	}

}
