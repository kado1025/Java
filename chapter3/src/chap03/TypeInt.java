package chap03;

public class TypeInt {

	public static void main(String[] args) {
		int var1=0b1011; //2����
		int var2=0xB3; //16����
		int var3=356; //10����
		
		byte var4=-128; //byte ����
		//byte var5=128; // ������ ����
		long var6=10000000000L;// ���� ���ͷ��� intŸ���� ��� ���� �Ѵ� ��� 'L'���̱�
		//long var7=10000000000; //������ ����
		
		char c1= 'A'; //���� ���� ����
		char c2= 65; //10������ ����
		char c3='\u0041';// 16������ ����
		String name= "mklee";//���ڿ�
		String str1="i like \"java\"";//�̽������� ����
		String str2="number\tname\tage";//�̽������� ����
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var6);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(name);
		System.out.println(str1);
		System.out.println(str2);
		

	}

}
