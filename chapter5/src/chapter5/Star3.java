package chapter5;
import java.util.Scanner;
public class Star3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("���ϴ� ���ڸ� �Է��ϼ��� : ");
        int num =stdin.nextInt();
        int i=1;
        while ( i <= num ) //�� �ݺ�
        {
        	
        	int j = num;
     	
        	while (0 < j) //�� ��� �ݺ�
        	{
        		if(i<j) {
        			System.out.print(" ");
        		}
        		else {	
        		System.out.print("*");
        		
        		}
        		j=j-1;
        		
        	}
        	System.out.println(); //�� �ٲ�
        	i=i+1;
        }	
	}

}
