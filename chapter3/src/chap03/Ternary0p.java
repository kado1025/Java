/**
 * 3�� ����
 */
package chap03;
import java.util.Scanner;
public class Ternary0p {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("Enter number:");
		int a=stdin.nextInt();//ù��° ���� ����
		
		boolean flag;
		flag=(a%2==0)?true:false;
		System.out.print(a+"�� ¦���ΰ�?:");
		System.out.print(flag);
	}

}
