/*main() 메소드의 매개 변수
 * main()메소드는 자바에서 가장 먼저 실행되는 메소드
 * 
 */
package chapter8_1;

public class Sample {

	public static void main(String[] args) {
		String s1=args[0];//프로그램 실행시 지정한 첫 번째 값
		String s2=args[1];//프로그램 실행시 지정한 두 번째 값

		System.out.println("first"+s1);
		System.out.println("second"+s1);
	}

}
