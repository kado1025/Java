/**
 * 2023 04 18
 * Arrays Ŭ������ �ֿ� �޼ҵ�
 * Ŭ������ �Ӽ��� ������� ����
 * �޼ҵ�� Ŭ������ �ٽ����� Ŭ������ � ����� �ϴ��� ��Ÿ��
 * �迭 ���� �޼ҵ�� 1���� �迭���� ����
 */
package chapter6;
import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		int[] int1= {9,1,7,3,5,4,6,2,8,0};
		System.out.println("�ʱ�迭:"+Arrays.toString(int1));//int1 ���ڿ��� ��ȯ ��
		
		Arrays.fill(int1, 3,5,33);//int1[3],[4]33���� ����
		System.out.println("fill()���� ��:"+Arrays.toString(int1));
		
		Arrays.sort(int1);//int1 �������� ����
		System.out.println("sort()���� ��:"+Arrays.toString(int1));
		
		System.out.println("33�� �迭�� "+Arrays.binarySearch(int1,33));

	}

}
