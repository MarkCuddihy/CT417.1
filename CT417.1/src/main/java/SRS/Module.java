package SRS;
import java.util.ArrayList;

public class Module {
	private String name, ID;
	private ArrayList<Student> aStudents;
	
	public Module() {
		
	}
	public Module(String name, String id) {
		this.name = name;
		this.ID = id;
		this.aStudents = new ArrayList<Student>();
	}
	
	public ArrayList<Student> getaStudents() {
		return aStudents;
	}
	public void setaStudents(ArrayList<Student> aStudents) {
		this.aStudents = aStudents;
	}
	public void addStudent(Student s) {
		this.aStudents.add(s);
	}
	public void removeStudent(Student s) {
		this.aStudents.remove(s);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		this.ID = id;
	}
}
