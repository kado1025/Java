package chapter5;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("���ϴ� ���ڸ� �Է��ϼ��� : ");
        int num =stdin.nextInt();
        int i=1;
        while ( i <= num ) //�� �ݺ�
        {
        	int j =num;
        	while (j >= i) //�� ��� �ݺ�
        	{
        		System.out.print("*");
        		j--;
        	}
        	System.out.println(); //�� �ٲ�
        	i++;
        }
	}

}