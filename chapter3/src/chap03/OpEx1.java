/**
 * ������ȯ ���α׷�
 * �Էµ� �׼���ŭ500��, 100��, 50��, 10��¥�� �������� ��ȯ���ִ� ���α׷� �ۼ�
 * ����1:������ �Ѱ����� �ּ�ȭ
 * ����2:����� ���� �켱 ��ȯ
 */
package chap03;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� :");
		int money = Integer.parseInt(stdin.nextLine()); 
		int[] coins = {500,100,50,10};
		int[] result = new int [coins.length];
		 
		for(int i = 0; i < coins.length ; i++){
		    result[i] += money / coins[i];
		    money = money % coins[i];
		}
		 
		for(int i = 0; i < coins.length ; i++) {
		    if(i != coins.length-1) {
		        System.out.print(coins[i] + "�� : " + result[i] + "��, ");
		    }else {
		        System.out.print(coins[i] + "�� : " + result[i] + "��");
		    }
		}     
		/*
		double var1= a/500;
		double var2= a/100;
		double var3= a/50;
		double var4= a/10;
		
		System.out.println("500=" + var1);
		System.out.println("100=" + var2);
		System.out.println("50=" + var3);
		System.out.println("10=" + var4);
		*/
	}

}
