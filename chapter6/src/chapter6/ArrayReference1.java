/**
 * 2023 04 18
 * null�� Num11PointException
 * ���������� ==����� equals()�޼ҵ�
 */
package chapter6;

public class ArrayReference1 {

	public static void main(String[] args) {
		//int[] intArray=null;
		//intArray[0]=10; //������ü �����Ƿ� Nullpointexception 
		
		String strVal1="java";
		String strVal2="java";
		
		if(strVal1==strVal2) {
			System.out.println("strVal1,strVal2 same reference.");
		}else {
			System.out.println("strVal1,strVal2 diferent reference.");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1,strVal2 same string.");
		}
		
		String strVal3=new String("mklee");
		String strVal4=new String("mklee");
		
		if(strVal3==strVal4) {
			System.out.println("strVal3,strVal4 same reference.");
		}else {
			System.out.println("strVal1,strVal2 diferent reference.");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3, strVal4 same string.");
		}
				

	}

}
