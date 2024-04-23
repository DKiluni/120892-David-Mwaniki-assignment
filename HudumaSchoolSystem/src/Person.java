import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public abstract class Person {
    private String name;
    private int age;
    private UUID id;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", name, age);
    }
}

