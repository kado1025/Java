/**
 * 2022 04 04
 * ������
 * �Է¹��� ������ ���丮�� ���ϱ�
 * #�����м�
 *  --���� :fac,facvalue
 * #�˰���
 * 1. ���丮�� ���� �� �Է�(fac)
 * 2. �ݺ���
 * while(fac>1)
 *   {
 *    facvalue=fac�� 1�� �����ϸ鼭 ���ϱ�
 * 3.������
 */
package chapter5;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
        System.out.print("input number : ");
        int fac =stdin.nextInt();
        int facvalue=fac;
        
        while(fac>1)
        {
            System.out.print(fac+"*");
            facvalue *= --fac;
            
            
        }
        System.out.print("1="+ facvalue);
	}

}
