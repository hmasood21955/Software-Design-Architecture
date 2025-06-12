// Model for Student
class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public double getMarks() { return marks; }
    public void setName(String name) { this.name = name; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public void setMarks(double marks) { this.marks = marks; }
}

// Model for Student Summary
class StudentSummary {
    public String getSummary(Student student) {
        return "Student: " + student.getName() +
               ", Roll No: " + student.getRollNumber() +
               ", Marks: " + student.getMarks();
    }
}

// View
class View {
    public void printStudentDetails(String summary) {
        System.out.println(summary);
    }
}

// Controller
class Controller {
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

// Main
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ali", 101, 89.5);
        StudentSummary summaryModel = new StudentSummary();
        View view = new View();
        Controller controller = new Controller(student, summaryModel, view);

        // Update and display
        controller.updateView();

        // Change data and display again
        controller.setStudentName("Sara");
        controller.setStudentRollNumber(102);
        controller.setStudentMarks(95.0);
        controller.updateView();
    }
}