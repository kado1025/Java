/**
 * 2022 04 04
 * ������
 * 1~100 ������ ���� �߿��� ����ڷκ��� �Է� ���� ������ ����� ���� ���϶�.
 * (while,continue �̿�)
 * #�����м�
 *  -���� :
 * #�˰���
 * 1. 
 * 2.
 */
package chapter5;

import java.util.Scanner;

public class ContinewTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num=stdin.nextInt();
		int i=0,sum=0;
		
		while (i<=100)
		{
			i++;
			if(i%num!=0)
				continue;
			
			sum=sum+i; //num�� ����� ���ϱ�
		}
		System.out.println("����� �� "+ sum); // ���
	}

}
