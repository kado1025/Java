package chapter5;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세요 : ");
        int num =stdin.nextInt();
        int i=1;
        while ( i <= num ) //줄 반복
        {
        	int j =num;
        	while (j >= i) //별 찍기 반복
        	{
        		System.out.print("*");
        		j--;
        	}
        	System.out.println(); //줄 바꿈
        	i++;
        }
	}

}