/**
 * 2022 04 04
 * 강동현
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 * #문제분석
 *  -변수 : num
 * #알고리즘
 * 1. 
 * 2.
 */
package chapter5;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		int sum=0; //합계
		int count=0; //입력 횟수
		
		while (true) {
			Scanner stdin = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int num=stdin.nextInt();
			
			count++; // 입력 횟수 증가
			sum=sum+num;//입력받은값의 합계
			
			if (sum>=1000) //합계가 1000이상인지
				break; //반복종료
		}
		System.out.println("합계 : "+ sum); //합계 출력
		System.out.println("평균 : "+ sum/count); //평균 출력

		
	}

}
