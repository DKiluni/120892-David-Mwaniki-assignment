class StudentGrade {
    private String name;
    private String studentId;
    private String grade;

    public StudentGrade(String name, String studentId, String grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public void assignGrade(int score) {


        try {
            System.out.println("Student's name: " + name);
            System.out.println("Student's ID no: " + studentId);
            System.out.println("The student's has scored: " + score + "%");
            if ((score < 80) || (score > 100)) {
                throw new IllegalArgumentException("Failed to grade student.");
            }
            System.out.println("The student has been assigned grade: " + grade);
        } catch (IllegalArgumentException e) {
            System.out.println("Error trying to assign grade: " + e.getMessage());
        } finally {
            System.out.println("Grading complete.");
        }
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getGrade() {
        return grade;
    }

        public static void main(String[] args) {
            StudentGrade grade = new StudentGrade("David", "120892", "A");
            StudentGrade grade1 = new StudentGrade("Jack", "105517", " ");
            grade.assignGrade(85);
            grade1.assignGrade(70);
        }
    }