package ooss;

public class Student extends Person {

    private int klassNumber;
    private boolean isLeader;
    
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public int getKlassNumber() {
        return klassNumber;
    }

    public void join(Klass klass) {
        klassNumber = klass.getNumber();
    }

    public boolean isIn(Klass klass) {
        return klass.getNumber() == klassNumber;
    }

    public void setLeader(boolean leader) {
        this.isLeader = leader;
    }

    public String introduce() {
        String studentIntroduction = super.introduce().concat(" I am a student.");
        if (isLeader) {
            studentIntroduction = studentIntroduction.concat(" I am the leader of class " + klassNumber + ".");
        } else if (klassNumber != 0) {
            studentIntroduction = studentIntroduction.concat(" I am in class " + klassNumber + ".");
        }
        return studentIntroduction;
    }
}
