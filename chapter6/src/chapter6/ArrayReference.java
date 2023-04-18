/** 2023 04 18
 * ��ü ���� �迭
 * ����Ÿ��(Ŭ����,�������̽�) �迭�� �� �׸� ��ü�� ������ ����
 * String�� Ŭ���� �̹Ƿ� String[]�迭�� �� �׸� ���ڿ��� �ƴ� ,String��ü�� ������ ����
 * String[]�迭�� ���� �񱳴� ==������ ��� equals()�޼ҵ� ���
 * 
 */
package chapter6;

public class ArrayReference {

	public static void main(String[] args) {
		String[] strArray=new String[3]; //�迭����
		strArray[0]="java";
		strArray[1]="java";
		strArray[2]=new String("java");
		
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[0]==strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
