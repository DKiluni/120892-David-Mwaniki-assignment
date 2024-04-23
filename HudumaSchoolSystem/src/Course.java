import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Course {
    private String courseName;
    private String courseCode;
    private Faculty assignedFaculty;
    private List<Student> enrolledStudents;
    private UUID id;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.id = UUID.randomUUID();
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void unenrollStudent(Student student) {
        enrolledStudents.remove(student);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
