/**
 * 1차원 정수 배열을 생성하고 , 배열에서 가장 큰 값을 찾아내는 프로그램을 
 * 확장된 for문을 이용하여 작성한 프로그램입니다.
 */
package chapter6;

public class ArraysTest2 {

	public static void main(String[] args) {
		
		int score[] = {88,97,53,62,92,68,82};
		int max=score[0];

		for(int i:score)		{
			if ( i > max)// 기존의 for 문을 사용할 때의 if 문 : if (score[i] > max)
				max = i;// max = score[i];
		}
		System.out.println("배열 요소의 최대값은 "+ max + " 입니다");
	}
}



