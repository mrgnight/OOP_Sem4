/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi7;
import java.util.ArrayList;
        
/**
 *
 * @author HP
 */
public class TestCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Course course1 = new Course("Course PERTAMA");
        Course course2 = new Course("Course KEDUA");
        
        //course 1: Peter Jones, Kim Smith, Anne Kennedy
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        //course 2: Peter Jones, Steve Smith,
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.printf("Number of students in %s: %d\n", course1.getCourseName(), course1.getNumberOfStudents());
        System.out.println(course1.getStudents());
        
        System.out.printf("\nNumber of students in %s: %d\n",course2.getCourseName() ,course2.getNumberOfStudents());
        System.out.println(course2.getStudents());
        
        System.out.printf("\nDrop students: Peter Jones from %s\n", course1.getCourseName());
        course1.dropStudent("Peter Jones");
        System.out.printf("Number of students in %s: %d\n", course1.getCourseName(),course1.getNumberOfStudents());
        System.out.println(course1.getStudents());
    }
    
}
