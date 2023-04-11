/** 202295001 ������
 * 2���� �迭�� �����ϰ� ������ �߻����� �迭�� ������ �ʱ�ȭ�� �����ϴ� ���α׷�.
 * ���� 2���� �迭���� �� ���� �հ踦 ����ϴ� ���α׷�.
 * P 248
 */
package chapter6;

import java.util.Random;
public class MultiArrayTest {

	public static void main(String[] args) {
		Random ran = new Random(); // ���� �߻�
		int[][] score = new int[4][4]; //2���� �迭 ����
		
		for (int i=0 ; i<4; i ++) // ��
			for(int j =0; j<4 ; j++) // ��
				score[i][j] = ran.nextInt(10); // 0~9���� ���� �߻�
		
		for (int k=0 ; k <4; k++) { // ��
			int sum=0;
			
			for (int value : score[k]) {
				System.out.print(value + " ");
				sum = sum + value;
			}
			System.out.println("�� �հ�� "+ sum);
		}

	}

}
