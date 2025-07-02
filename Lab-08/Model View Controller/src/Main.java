import controller.Controller;
import model.Student;
import model.StudentSummary;
import view.View;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ali", 101, 89.5);
        StudentSummary summaryModel = new StudentSummary();
        View view = new View();
        Controller controller = new Controller(student, summaryModel, view);

        controller.updateView();

        controller.setStudentName("Sara");
        controller.setStudentRollNumber(102);
        controller.setStudentMarks(95.0);
        controller.updateView();
    }
} 