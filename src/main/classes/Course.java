/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.classes;

/**
 *
 * @author Badr-Alfwazi
 */
public class Course {
    private String courseId;
    private String courseName;
    private String courseTeacher;
    private String max;
    public Course(String courseId,String courseName,String courseTeacher,String Max){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.max= Max;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public String getMax() {
        return max;
    }
    
}
