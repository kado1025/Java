/**
 * 2023 04 18
 * ArrayŬ���� - System.arraycopy(str1, 0 , str2, 0 ,len)
 * 				str1�迭�� �ε��� 0 ~ str2 �迭�� �ε��� 0�� len ��ŭ ����					
 */
package chapter6;
import java.util.Arrays;
public class ArrayCopy {

	public static void main(String[] args) {
		int num1[] = {10,20,30};
		int num2[] = {40,50,60};
		String str3[]= {"java","array","copy"};
		String str4[]= new String[5];//str4�� null�� �ʱ�ȭ
		
		//�迭 ��� ���� ���� ����
		for (int i=0; i<num1.length;i++)
			num2[i]=num1[i];
		
		System.out.print("num2 value:");
		for (int i:num2) //num2 ��� (10,20,30)
			System.out.print(i+" ");
		
		//System.arraycopy()�� ����
		System.arraycopy(str3,0,str4,0,3);
		
		System.out.print("\nstr4 value:");
		
		for (String value:str4) //str4 ���
			System.out.print(value+" "); //������� ���� �׸��� �ʱⰪ ���
		
		//Arrays.copyof()�� ����
		String str5[]=Arrays.copyOf(str3, 2); // str3�迭�� �ε��� 0~���� 2��ŭ
		
		System.out.print("\nstr5 value:");
		
		for (String value1:str5 ) //str5 ���
			System.out.print(value1+" ");
	}

}
