package controller;

import model.Student;
import model.StudentSummary;
import view.View;

public class Controller {
    private Student student;
    private StudentSummary summaryModel;
    private View view;

    public Controller(Student student, StudentSummary summaryModel, View view) {
        this.student = student;
        this.summaryModel = summaryModel;
        this.view = view;
    }

    public void setStudentName(String name) { student.setName(name); }
    public void setStudentRollNumber(int rollNumber) { student.setRollNumber(rollNumber); }
    public void setStudentMarks(double marks) { student.setMarks(marks); }

    public void updateView() {
        String summary = summaryModel.getSummary(student);
        view.printStudentDetails(summary);
    }
} 