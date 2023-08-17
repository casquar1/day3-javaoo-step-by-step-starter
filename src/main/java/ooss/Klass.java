package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {

    private final int number;
    private Student leader;
    private final List<Person> persons = new ArrayList<>();

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
        } else
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
            String personType = person instanceof Teacher ? "teacher" : "student";
            System.out.printf("I am %s, %s of Class %d. I know %s become Leader.", person.getName(), personType, number, leader.getName());
        }
    }
}
