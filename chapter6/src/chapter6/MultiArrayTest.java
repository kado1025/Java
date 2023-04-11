/** 202295001 강동현
 * 2차원 배열을 생성하고 난수를 발생시켜 배열의 값으로 초기화를 수행하는 프로그램.
 * 또한 2차원 배열에서 각 행의 합계를 출력하는 프로그램.
 * P 248
 */
package chapter6;

import java.util.Random;
public class MultiArrayTest {

	public static void main(String[] args) {
		Random ran = new Random(); // 난수 발생
		int[][] score = new int[4][4]; //2차원 배열 생성
		
		for (int i=0 ; i<4; i ++) // 행
			for(int j =0; j<4 ; j++) // 열
				score[i][j] = ran.nextInt(10); // 0~9까지 난수 발생
		
		for (int k=0 ; k <4; k++) { // 행
			int sum=0;
			
			for (int value : score[k]) {
				System.out.print(value + " ");
				sum = sum + value;
			}
			System.out.println("의 합계는 "+ sum);
		}

	}

}
