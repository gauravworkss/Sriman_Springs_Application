package com.cdi.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class University {
	private List<String> courses;
	private Map<String, String> facultyToSubjects;
	private Set<String> subjects;
	private Properties standards;

	public University(Map<String, String> facultyToSubjects) {
		this.facultyToSubjects = facultyToSubjects;
	}
	
	public Properties getStandards() {
		return standards;
	}

	public void setStandards(Properties standards) {
		this.standards = standards;
	}

	public Set<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Map<String, String> getFacultyToSubjects() {
		return facultyToSubjects;
	}

}
