package student;
import java.util.HashMap;

public class StudentGradeManager {
    private HashMap<String, Integer> studentGrades;

    public StudentGradeManager() {
        this.studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println(name + "'s Grade: " + grade);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void main(String[] args) {
        StudentGradeManager gradeManager = new StudentGradeManager();

        // Adding students and grades
        gradeManager.addStudent("John", 85);
        gradeManager.addStudent("Alice", 92);
        gradeManager.addStudent("Bob", 78);

        // Displaying grades
        gradeManager.displayGrade("John");
        gradeManager.displayGrade("Alice");
        gradeManager.displayGrade("Charlie");  // Student not found

        // Removing a student and displaying updated grades
        gradeManager.removeStudent("Bob");
        System.out.println("After removing Bob:");
        gradeManager.displayGrade("Bob");  // Student not found
    }
}