package by.epam.course.basic.main;

import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 25 February 2017
 * 
 * Task: Используя код листинга 4 напишите приложение, выводящее на консоль календать на год.
 */
public class Task1 {
	
	public static void main(String[] args) {
		GregorianCalendar d = new GregorianCalendar();
		int today_day = d.get(Calendar.DAY_OF_MONTH);
		int today_month = d.get(Calendar.MONTH);
		String[] monthNames = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
		
		d.set(d.get(Calendar.YEAR) , 0, 1);
			
		for (int j = 0; j < 12; j++){
			System.out.println();
			System.out.println(monthNames[j]+":");
			
			
			int month = d.get(Calendar.MONTH);
			int weekday = d.get(Calendar.DAY_OF_WEEK);
			System.out.println("Вс Пн Вт Ср Чт Пт Сб");
			for (int i = Calendar.SUNDAY; i < weekday; i++)
				System.out.print("   ");
			do {
				int day = d.get(Calendar.DAY_OF_MONTH);
				if (day < 10)
					System.out.print(" ");
				System.out.print(day);
				if ((day == today_day) & (month == today_month)) 
					System.out.print("*");
				else
					System.out.print(" ");
				if (weekday == Calendar.SATURDAY)
					System.out.println();

				d.add(Calendar.DAY_OF_MONTH, 1);
				weekday = d.get(Calendar.DAY_OF_WEEK);
			} while (d.get(Calendar.MONTH) == month);
			if (weekday != Calendar.SUNDAY)
				System.out.println();
		}
		
	}
}