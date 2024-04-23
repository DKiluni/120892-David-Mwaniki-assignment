import java.util.*;

public class ManagementSystem implements IManageable {
    private Map<UUID, Person> people;
    private Map<UUID, Course> courses;
    private Map<UUID, Department> departments;

    public ManagementSystem() {
        this.people = new HashMap<>();
        this.courses = new HashMap<>();
        this.departments = new HashMap<>();
    }

    @Override
    public void addPerson(Person person) {
        people.put(person.getId(), person);
    }

    @Override
    public void removePerson(UUID personId) {
        if (people.containsKey(personId)) {
            people.remove(personId);
        }
    }

    @Override
    public void updatePerson(UUID personId, Map<String, Object> newInfo) {
        Person person = people.get(personId);
        if (person != null) {
            if (newInfo.containsKey("name")) {
                person.setName((String) newInfo.get("name"));
            }
            if (newInfo.containsKey("age")) {
                person.setAge((int) newInfo.get("age"));
            }
        }
    }

    public void addStudent(Student student) {
        addPerson(student);
    }

    public void removeStudent(UUID studentId) {
        removePerson(studentId);
    }

    public void updateStudent(UUID studentId, Map<String, Object> newInfo) {
        updatePerson(studentId, newInfo);
    }

    public void addFaculty(Faculty faculty) {
        addPerson(faculty);
    }

    public void removeFaculty(UUID facultyId) {
        removePerson(facultyId);
    }

    public void updateFaculty(UUID facultyId, Map<String, Object> newInfo) {
        updatePerson(facultyId, newInfo);
    }

    public void addCourse(Course course) {
        courses.put(course.getId(), course);
    }

    public void removeCourse(UUID courseId) {
        if (courses.containsKey(courseId)) {
            courses.remove(courseId);
        }
    }
    public void updateCourse(UUID courseId, Map<String, Object> newInfo) {
        updatePerson(courseId, newInfo);
    }
    public void addDepartment(Department department) {
        departments.put(department.getId(), department);
    }

    public void removeDepartment(UUID departmentId) {
        if (departments.containsKey(departmentId)) {
            departments.remove(departmentId);
        }
    }
}







