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
		while (true)
		Scanner stdin = new Scanner(System.in);
        System.out.print("���� �Է� (1000�̻��� �ɶ����� �Է�) : ");
        int num = stdin.nextInt();
        int i;
        
        for (i=1;1000 < num ; i++)
        {
        	if (num>1000)
                System.out.print(i+ "1000�� ���� �� ");

        }
	}

}
