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
public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList();
    private int numberOfStudents;
    
    Course(String courseName){
        Course.this.courseName = courseName;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }
    
    public void dropStudent(String student){
        students.remove(student);
        numberOfStudents--;
    }
    
    public ArrayList<String> getStudents(){
        return students;
    }
    
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    
}
