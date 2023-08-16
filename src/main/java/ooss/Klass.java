package ooss;

import java.util.Objects;

public class Klass {

    private final int number;
    private Student leader;

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
        }
        System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student) {
        return leader.equals(student);
    }
}
