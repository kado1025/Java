package chapter7;

public class PlusMinusTest1 {

	public static void main(String[] args) {
		PlusMinus ob1 = new PlusMinus();
		String ssum, sminus;
		
		ssum = ob1.plus(50,30); // �޼ҵ� ȣ��
		sminus = ob1.minus(50,30); // �޼ҵ� ȣ��
		
		System.out.println(ssum);
		System.out.println(sminus);
	}

}
