package chapter2;
/**
 * 2023.03.14
 * �� ���� ���� �Է¹޾� ù ��° ���� ���ڿ�������, �� ��° ���� ������
 * �� ��° ���� �Ǽ������� ����ϴ� ���α׷��Դϴ�.
 * @author ������
 */
import java.util.Scanner;
public class keyboardinput {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�̸��� ����, �����Ը� ����(space)���� �����Ͽ� �Է� : ");
		String name = stdIn.next();//�̸� ���ڿ��� �Է�
		int i = stdIn.nextInt();//���� ������ �Է�
		double d = stdIn.nextDouble();//�����Ը� �Ǽ��� �Է�
		System.out.println(name + "���� ���̴�" + i + "���̰�");
		System.out.println("�����Դ� " + d + "Kg �Դϴ�");
		
	}

}
