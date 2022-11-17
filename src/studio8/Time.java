package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {

	private int minute;
	private int hours;
	
	/**
	 * 
	 * @param minute
	 * @param hours
	 */
	
	public Time (int minute, int hours) {
		this.minute = minute;
		this.hours = hours;
	}
	
	public String toString() {
		return hours + ":" + minute;
	}
	
	public static void main(String[] args) {
		Time time1 = new Time (22, 13);
    	time1.toString();
    	System.out.println(time1);
    	Time time2 = new Time (15,8);
    	time2.toString();
    	Time time3 = new Time (22, 13);
    	time3.toString();
    	Time time4 = new Time (30,17);
    	time4.toString();
    	
    	LinkedList<Time> list = new LinkedList<Time> (); 
    	list.add(time1);
    	list.add(time2);
    	list.add(time3);
    	list.add(time4);
    	System.out.println(list);
    	
    	HashSet<Time> set = new HashSet<Time>();
    	set.add(time1);
    	set.add(time3);
    	System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(hours, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hours == other.hours && minute == other.minute;
	}

}