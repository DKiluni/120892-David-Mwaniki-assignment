//Class with a custom exception method
class InvalidAgeException  extends Exception {
    public InvalidAgeException (String message) {
        super(message);
    }
}

class Patient {
    private String name;
    private int age1;

    public Patient(String name, int age1) {
        this.name = name;
        this.age1 = age1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge(int age) {
       try {
            System.out.println("Patient's Name: " + name);
            System.out.println("Attempting to change this patient's age to: " + age + " from: " + age1);
            if ((age < 0) || (age > 130)) {
                throw new InvalidAgeException ("The age provided is not valid.");
            }
            System.out.println("The age has been set to: " + age);
        }
        catch (InvalidAgeException  e) {
            System.out.println("Error trying to set age: " + e.getMessage());


        }
    }


    public static void main(String[] args) {
        Patient details = new Patient("Joseph", 45);
        Patient details2 = new Patient("Peterson", 125);
        details.setAge(50);
        details2.setAge(135);
    }
}



