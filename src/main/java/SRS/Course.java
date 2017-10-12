package SRS;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class Course {
	private String name;
	private ArrayList<Module> aModules;
	private LocalDate startDate, endDate;
	
	public Course() {
		
	}
	
	public Course(String name, int sDD, int sMM, int sYYYY, int eDD, int eMM, int eYYYY) {
		this.name = name;
		this.startDate = new LocalDate(sYYYY, sMM, sDD);
		this.endDate = new LocalDate(eYYYY, eMM, eDD);
		aModules = new ArrayList<Module>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Module> getaModules() {
		return aModules;
	}

	public void setaModules(ArrayList<Module> aModules) {
		this.aModules = aModules;
	}
	
	public void addModule(Module m) {
		this.aModules.add(m);
	}
	
	public void removeModule(Module m) {
		this.aModules.remove(m);
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(int dd, int mm, int yyyy) {
		this.startDate = new LocalDate(yyyy,mm,dd);
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(int dd, int mm, int yyyy) {
		this.endDate = new LocalDate(yyyy,mm,dd);
	}
	
	
}
