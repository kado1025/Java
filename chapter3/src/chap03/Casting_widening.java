/* 2023 03 21 
 * ������
 * 
 */
package chap03;

import java.util.Scanner;

public class Casting_widening {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("first integer:");
		int first=stdin.nextInt();//ù��° ���� ����
		
		System.out.print("second integer:");
		int second=stdin.nextInt();//�ι�° ���� ����
		
		double avg1=(first + second)/2;// ���� ���� ����
		double avg2=(first + second)/2.0;// ���� �Ǽ�(����ȯ) ����
		double avg3=(first + second)/(float)2;// ���� �Ǽ�(����ȯ) ����
		
		System.out.println("��������:"+avg1);
		System.out.println("�Ǽ�����:"+avg2);
		System.out.println("�Ǽ�����:"+avg3);

	}

}
