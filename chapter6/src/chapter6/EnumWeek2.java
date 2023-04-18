/**2023 04 18
 * ����Ÿ�� week �̿��Ϸ��� ��¥ �����ʿ�
 * ��ǻ���� ��¥,����,�ð��� ��� ���� CalendarŬ���� �ʿ�
 * Calendar.getInstance() Calendar ��ü ���
 * today�� ���� ������ ����, week��ü�� �� ������ ����  
 * week.SUNDAY�� �޼ҵ� ������ ����
 * today�� ����Ǵ� ���� week.SUNDAY ���� ����� �����ϴ� ��ü ����
 * week.SUNDAY�� today������ ���� ���� week ��ü ����
 * 
 */
package chapter6;
import java.util.Calendar;

import chapter6.EnumWeek.Week;
public class EnumWeek2 {

	public static void main(String[] args) {
		Week today=null; //���� Ÿ�� ���� ����
		
		Calendar cal=Calendar.getInstance();//Calendar ��ü ���
		int week=cal.get(Calendar.DAY_OF_WEEK);//��(1)~��(7)���� ���� ����
		
		switch(week) {
		case 1:
			today=Week.SUNDAY; // ���� ��� ����
			break;
		case 2:
			today=Week.MONDAY; // ���� ��� ����
			break;
		case 3:
			today=Week.TUESDAY; // ���� ��� ����
			break;
		case 4:
			today=Week.WEDNESDAY; // ���� ��� ����
			break;
		case 5:
			today=Week.THURSDAY; // ���� ��� ����
			break;
		case 6:
			today=Week.FRIDAY; // ���� ��� ����
			break;
		case 7:
			today=Week.SATURDAY; // ���� ��� ����
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
