package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int day;
	private int month;
	private int year;
	
	/**
	 * 
	 * @param day of the month 
	 * @param month of the year
	 * @param year
	 */
	
	public Date (int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		return month + " - " + day + " - " + year; 
	}

    public static void main(String[] args) {
    	Date date1 = new Date (17, 11, 2022);
    	date1.toString();
    	System.out.println(date1);
    	Date date2 = new Date (17, 11, 2022);
    	date2.toString();
    	Date date3 = new Date (19, 1, 2003);
    	date3.toString();
    	Date date4 = new Date (10, 9, 2018);
    	date4.toString();
    	
    	LinkedList<Date> list = new LinkedList<Date> (); 
    	list.add(date1);
    	list.add(date2);
    	list.add(date3);
    	list.add(date4);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(date1);
    	set.add(date2);
    	System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
