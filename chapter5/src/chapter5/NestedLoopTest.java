/**
 * 2022 04 04
 * ������
 * �Է¹��� ���ڸ�ŭ �ټ��� �ݺ��ϸ鼭 �����ﰢ�� ���
 * #�����м�
 *  -���� : num, i , j
 * #�˰���
 * 1. �� �� �Է� (num)
 * 2. ��ø�ݺ�
 * 		while(i<=num) // �� �ݺ�
 * 		{
 * 		 while(j<=i) // �� ��� �ݺ�
 * 			�� ���
 * 		}
 * 
 */
package chapter5;

import java.util.Scanner;

public class NestedLoopTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("���ϴ� ���ڸ� �Է��ϼ��� : ");
        int num =stdin.nextInt();
        int i=1;
        while ( i <= num ) //�� �ݺ�
        {
        	int j =1;
        	while (j <= i) //�� ��� �ݺ�
        	{
        		System.out.print("*");
        		j=j+1;
        	}
        	System.out.println(); //�� �ٲ�
        	i=i+1;
        }
	}

}
