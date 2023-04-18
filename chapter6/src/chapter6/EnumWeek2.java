/**2023 04 18
 * 열거타입 week 이용하려면 날짜 정보필요
 * 컴퓨터의 날짜,요일,시간을 얻기 위해 Calendar클래스 필요
 * Calendar.getInstance() Calendar 객체 얻기
 * today는 스택 영역에 생성, week객체는 합 영역에 생성  
 * week.SUNDAY는 메소드 영역에 생성
 * today에 저장되는 값은 week.SUNDAY 열거 상수가 참조하는 객체 번지
 * week.SUNDAY와 today변수는 서로 같은 week 객체 참조
 * 
 */
package chapter6;
import java.util.Calendar;

import chapter6.EnumWeek.Week;
public class EnumWeek2 {

	public static void main(String[] args) {
		Week today=null; //열거 타입 변수 생성
		
		Calendar cal=Calendar.getInstance();//Calendar 객체 얻기
		int week=cal.get(Calendar.DAY_OF_WEEK);//일(1)~토(7)까지 숫자 리턴
		
		switch(week) {
		case 1:
			today=Week.SUNDAY; // 열거 상수 대입
			break;
		case 2:
			today=Week.MONDAY; // 열거 상수 대입
			break;
		case 3:
			today=Week.TUESDAY; // 열거 상수 대입
			break;
		case 4:
			today=Week.WEDNESDAY; // 열거 상수 대입
			break;
		case 5:
			today=Week.THURSDAY; // 열거 상수 대입
			break;
		case 6:
			today=Week.FRIDAY; // 열거 상수 대입
			break;
		case 7:
			today=Week.SATURDAY; // 열거 상수 대입
			break;
		}
		
		System.out.println("today is " + today);
		
		if (today==Week.SUNDAY) {
			System.out.println("rest on sunday");
		}else {
			System.out.println("study java");
		}
	}

}
