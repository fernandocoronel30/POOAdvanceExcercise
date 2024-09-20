package org.generation;

import org.generation.classes.Student;
import org.generation.classes.StudentService;
import org.generation.exceptions.CourseNotFoundException;

public class Main {

	public static void main(String[] args) throws CourseNotFoundException {
		StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        //studentService.students.put( "1030", new Student( "Carlos", "1030", 31 ) );
        //studentService.students.put( "1040", new Student( "Ian", "1020", 28 ) );
        //studentService.students.put( "1050", new Student( "Elise", "1020", 26 ) );
        //studentService.students.put( "1020", new Student( "Santiago", "1020", 33 ) );
        
        studentService.addStudents(new Student( "Carlos", "1030", 31 ));
        studentService.addStudents(new Student( "Ian", "1020", 28 ));
        studentService.addStudents(new Student( "Elise", "1020", 26 ));
        studentService.addStudents(new Student( "Santiago", "1020", 33 ));

        studentService.enrollStudents( "Math", "1030" );
                
        //studentService.showAllCourses();
        
        studentService.showEnrolledStudents("Math");
        studentService.showEnrolledStudents("History");

	}//main

}//class Main
