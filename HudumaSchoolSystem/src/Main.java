import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ManagementSystem system = new ManagementSystem();

        Student student = new Student("Alice", 20);
        system.addStudent(student);

        Faculty faculty = new Faculty("Bob", 30, "Computer Science");
        system.addFaculty(faculty);

        Course course = new Course("Python Programming", "CS101");
        system.addCourse(course);

        faculty.addCourse(course);
        student.enrollCourse(course);

        system.updateStudent(student.getId(), Map.of("name", "Alice Updated"));
        system.updateFaculty(faculty.getId(), Map.of("department", "Computer Science Updated"));
        system.updateCourse(course.getId(), Map.of("courseName", "Python Programming Updated"));
    }
}