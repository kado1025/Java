/**
 * ������ ���α׷�
 * ����1 : 4�� ������ ��������, 100���� ������ �������� ������ �����̴�.
 * ����2 : 400���� ������ �������� �ص� ���⿡ ���Եȴ�.
 * ������
 * �⵵�Է�: 2020
 * 2020���� �����Դϴ�.
 */
package chap03;

import java.util.Scanner;

public class OpEx2 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year=stdin.nextInt();//ù��° ���� ����
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "���� �����̴�.");
		}
		else 
		{
			System.out.println(year + "���� ������ �ƴ� mn�ϴ�.");
		}
			                                                                  
	}

}
