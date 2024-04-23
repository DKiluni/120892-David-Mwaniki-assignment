import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
    private String department;
    private List<Course> coursesTaught;

    public Faculty(String name, int age, String department) {
        super(name,age);
        this.department = department;
        this.coursesTaught = new ArrayList<>();
    }

    public void addCourse(Course course) {
        coursesTaught.add(course);
    }

    public void removeCourse(Course course) {
        coursesTaught.remove(course);
    }
}
