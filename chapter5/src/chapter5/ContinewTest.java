/**
 * 2022 04 04
 * 강동현
 * 1~100 까지의 숫자 중에서 사용자로부터 입력 받은 숫자의 배수의 합을 구하라.
 * (while,continue 이용)
 * #문제분석
 *  -변수 :
 * #알고리즘
 * 1. 
 * 2.
 */
package chapter5;

import java.util.Scanner;

public class ContinewTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num=stdin.nextInt();
		int i=0,sum=0;
		
		while (i<=100)
		{
			i++;
			if(i%num!=0)
				continue;
			
			sum=sum+i; //num의 배수만 더하기
		}
		System.out.println("배수의 합 "+ sum); // 출력
	}

}
