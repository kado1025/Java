/**
 * 2022 04 04
 * ������
 * �Է¹��� ������ ����� ����ϴ� ���α׷�
 * #�����м�
 *  -���� : num, i
 * #�˰���
 * 1. ����� ���� ���� �Է�(num)
 * 2. ���ճ�(�ݺ��� �ȿ� ���ù� ����)
 * 	  for(i=1;i<num;i++)
 * 	  {
 * 		if(num%i==0)
 * 		{
 * 		  i�� ���
 * 		}
 */
package chapter5;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
        System.out.print("���� �Է� : ");
        int num = stdin.nextInt();
        System.out.print(num + "�� ��� : ");
        for (int i = 1; i <= num ; i++)
        {
        	if (num % i == 0)
                System.out.print(i+ " ");

        }
	}

}
