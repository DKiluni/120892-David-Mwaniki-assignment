import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Course> coursesEnrolled;

    public Student(String name, int age) {
        super(name, age);
        this.coursesEnrolled = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }
}