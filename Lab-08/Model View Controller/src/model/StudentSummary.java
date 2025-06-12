package model;

public class StudentSummary {
    public String getSummary(Student student) {
        return "Student: " + student.getName() +
               ", Roll No: " + student.getRollNumber() +
               ", Marks: " + student.getMarks();
    }
} 