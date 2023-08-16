package ooss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private final List<Integer> klassNumber = new ArrayList<>();;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public void assignTo(Klass klass) {
        klassNumber.add(klass.getNumber());
    }

    public boolean belongsTo(Klass klass) {
       return klassNumber.contains(klass.getNumber());
    }

    @Override
    public String introduce() {
        return !klassNumber.isEmpty() ? super.introduce().concat(" I am a teacher. I teach Class " + klassNumber.toString().replace("[", "").replace("]", "") + ".") :
                super.introduce().concat(" I am a teacher.");
    }

    public boolean isTeaching(Student student) {
        return klassNumber.contains(student.getKlassNumber());
    }
}
