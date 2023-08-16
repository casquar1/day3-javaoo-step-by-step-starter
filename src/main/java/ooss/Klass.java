package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {

    private final int number;
    private Student leader;
    private List<Person> persons = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public void assignLeader(Student student) {
        if (student.isIn(this)) {
            setLeader(student);
            student.setLeader(true);
            leaderMessage();
        }
        System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student) {
        return leader != null && leader.equals(student);
    }

    public void attach(Person person) {
        this.persons.add(person);
    }

    public void leaderMessage() {
        for (Person person: persons) {
            if (person instanceof Teacher) {
                System.out.printf("I am %s, teacher of Class %d. I know %s become Leader.", person.getName(), number, leader.getName());
            } else {
                System.out.printf("I am %s, student of Class %d. I know %s become Leader.", person.getName(), number, leader.getName());
            }
        }
    }
}
