package SRS;
import org.joda.time.*;
import java.util.UUID;

public class Student {
	private String name, username, ID;
	private int age;
	private LocalDate dob;
	
	public Student() {
		
	}
	
	public Student(String name, int dd, int mm, int yyyy) {
		this.name = name;
		this.dob = new LocalDate(yyyy,mm,dd);
		LocalDate now = LocalDate.now();
		this.age = Years.yearsBetween(dob, now).getYears();
		this.username=getUsername();
		UUID uuid = UUID.randomUUID();
		this.ID = uuid.toString();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		//Remove all non alphabetic characters
		String tName = name.replaceAll("[^a-zA-Z]", "");
		//concat name+age
		this.username = tName+age ;
		return username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getID() {
		return ID;
	}
	
	public LocalDate getDOB() {
		return dob;
	}
	
	public void setDob(int dd, int mm, int yyyy) {
		this.dob = new LocalDate(yyyy,mm,dd);
	}

	
	
}
