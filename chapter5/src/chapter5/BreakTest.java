/**
 * 2022 04 04
 * ������
 * ���ڸ� �ݺ������� �Է� �޾Ƽ� ������ ���� 1000�̻��� �Ǹ� 1000�� ���� ���� ����� ���
 * #�����м�
 *  -���� : num
 * #�˰���
 * 1. 
 * 2.
 */
package chapter5;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		int sum=0; //�հ�
		int count=0; //�Է� Ƚ��
		
		while (true) {
			Scanner stdin = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int num=stdin.nextInt();
			
			count++; // �Է� Ƚ�� ����
			sum=sum+num;//�Է¹������� �հ�
			
			if (sum>=1000) //�հ谡 1000�̻�����
				break; //�ݺ�����
		}
		System.out.println("�հ� : "+ sum); //�հ� ���
		System.out.println("��� : "+ sum/count); //��� ���

		
	}

}
