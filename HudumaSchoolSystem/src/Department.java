import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Department {
    private String departmentName;
    private List<Course> courses;
    private List<Faculty> facultyMembers;
    private UUID id;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.id = UUID.randomUUID();
        this.courses = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        facultyMembers.remove(faculty);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
