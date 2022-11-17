package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	
	private Date date1;
	
	private Time time1;
	
	public Appointment (Date date1, Time time1) {
		this.date1 = date1;
		this.time1 = time1;
	}
	
	public String toString() {
		return date1.toString() + " " + time1.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Date date1 = new Date (17, 11, 2022);
		Time time1 = new Time (22, 13);
    	Date date2 = new Date (17, 11, 2022);
    	Time time2 = new Time (22,13);
    	Date date3 = new Date (19, 1, 2003);
    	Date date4 = new Date (10, 9, 2018);
    	Time time3 = new Time (22, 13);
    	Time time4 = new Time (30,17);

		Appointment A1 = new Appointment (date1, time1);
		Appointment A2 = new Appointment (date2, time2);
		Appointment A3 = new Appointment (date3, time3);
		Appointment A4 = new Appointment (date4, time4);


		HashSet<Appointment> calendar = new HashSet<Appointment>();
    	calendar.add(A1);
    	calendar.add(A2);
    	calendar.add(A3);
    	calendar.add(A4);
    	System.out.println(calendar);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date1, time1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date1, other.date1) && Objects.equals(time1, other.time1);
	}

}
