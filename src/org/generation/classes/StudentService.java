package org.generation.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.generation.exceptions.CourseNotFoundException;

public class StudentService {
	 	private HashMap<String, Course> courseList = new HashMap<>();

	    private HashMap<String, Student> students = new HashMap<>();

	    private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


	    public StudentService(){	    	
	        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
	        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
	        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
	        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
	        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
	    }
	    

	    public void enrollStudents( String courseName, String studentID ) throws CourseNotFoundException{
	    	
	        Course course = courseList.get( courseName );

	        if ( !coursesEnrolledByStudents.containsKey( studentID ) ){
	            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
	        }else {
	        	//throw new CourseNotFoundException(courseName);
	        }
	        coursesEnrolledByStudents.get( studentID ).add( course );
	    }//enrollStudents

	    public void unEnrollStudents( String courseName, String studentID ){
	        Course course = courseList.get( courseName );

	        if ( coursesEnrolledByStudents.containsKey( studentID ) )
	        {
	            coursesEnrolledByStudents.get( studentID ).remove( course );
	        }
	    }//unEnrollStudents

	    public void showEnrolledStudents(String courseId){
	        //TODO implement using collections loops
	    	System.out.println(courseId + " enrolled:");
	    	Course course = courseList.get(courseId);
	    	for (String studentId : coursesEnrolledByStudents.keySet() ) {
				List<Course> allCourse = coursesEnrolledByStudents.get(studentId);
				if(allCourse.contains(course)) {
					Student student = students.get(studentId);
					System.out.println(student);
				}//if
			}//foreach
	    }//showEnrolledStudents

	    public void showAllCourses(){
	        //TODO implement using collections loops
	    	for (Course course : courseList.values()) {
	    		System.out.println(course);
	    	}//foreach
	    }//showAllCourses

	    public void addStudents(Student student) {
	    	students.put(student.getId(), student);
	    }//addStudents

}//class StudentService
