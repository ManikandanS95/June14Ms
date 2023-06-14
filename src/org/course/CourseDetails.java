package org.course;

public class CourseDetails extends ComponyDetails {
	private void javaCourse() {
		System.out.println("Java course started");
	}
	private void pythonCourse() {
		System.out.println("Python course is started");

	}
	public static void main(String[] args) {
		CourseDetails c = new CourseDetails();
		c.empId();
		c.empName();
		c.compaonyId();
		c.componyName();
		c.javaCourse();
		c.pythonCourse();
	}


	

}
