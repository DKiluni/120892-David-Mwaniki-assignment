import java.util.*;

public interface IManageable {
    void addPerson(Person person);

    void removePerson(UUID personId);

    void updatePerson(UUID personId, Map<String, Object> newInfo);
}

