/**
 * �� ���� ���ڸ� �Է� �޾Ƽ� �� ���� ������ Ȧ������ ��� ���Ͽ� ����ϴ�
 * ���α׷� �ۼ�
 * #�����м�
 *  ���� num1,num2,sum
 * #�˰���
 *  1. �� ���� �Է�(num1,num2)
 *  2. ���ù� (if (num1<num2))
 *  3.���ճ� (�ݺ��� �ȿ� ���ù� ����)
 * 	   while(num1<=num2){
 * 		 if(num1%2==1){
 * 			sum=sum+num1
 * 			}
 * 		  num1=num1+1
 */
package chapter5;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
        System.out.print("num1 and num2 : ");
        int num1 =stdin.nextInt();
        int num2 =stdin.nextInt();
        int temp=0, sum=0;
        
        if (num1>num2)
        {
        	temp=num1;
        	num1=num2;
        	num2=temp;
        }
        while (num1<=num2)
        {
        	if(num1%2==1) //num1�� Ȧ��
        	{
        		sum=sum+num1;
        	}
        	num1=num1+1;
        }
        System.out.print("sum of odd numbers :  "+sum);

	}

}
