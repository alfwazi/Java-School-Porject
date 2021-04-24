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
public class Grade {
    private String userId;
    private String fullName;
    private String Subname;
    private String OralMark;
    private String JobMark;
    private String StudyMark;
    private String ExamMark;
    private String ResultMark;

    public Grade(String fullName, String Subname, String OralMark, String JobMark, String StudyMark, String ExamMark, String ResultMark ,String userId) {
        this.fullName = fullName;
        this.Subname = Subname;
        this.OralMark = OralMark;
        this.JobMark = JobMark;
        this.StudyMark = StudyMark;
        this.ExamMark = ExamMark;
        this.ResultMark = ResultMark;
        this.userId =userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSubname() {
        return Subname;
    }

    public String getOralMark() {
        return OralMark;
    }

    public String getJobMark() {
        return JobMark;
    }

    public String getStudyMark() {
        return StudyMark;
    }

    public String getExamMark() {
        return ExamMark;
    }

    public String getResultMark() {
        return ResultMark;
    }

    public String getUserId() {
        return userId;
    }

}
