/**
 * 2023 04 04
 * ������
 *  �� ���ڸ� �Է� �޾Ƽ� �� �� ������ �հ� ����ϱ�
 *  #�����м�
 *  -����:first, second, total
 *  #�˰���
 *  1.���� �Է�(first,second)
 *  2.���ù�(if(first<second))
 *  3.�ݺ���(for (first; second; first++)
 *  			total=total+first
 */
package chapter5;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
        System.out.print("first second : ");
        int first =stdin.nextInt();
        int second =stdin.nextInt();
        int temp=0, total=0;
        
        //first�� second ���� �׻� ���� ���� ������.
        if (first>second)
        {
        	temp=first;
        	first=second;
        	second=temp;
        }
        //�ݺ�(first~second������ �հ�)
        while (first<=second)
        {
        	total=total+first;
        	first=first+1;
        }
        System.out.print("first~second total : "+total);

	}

}
