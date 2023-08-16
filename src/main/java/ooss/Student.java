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

    @Override
    public String introduce() {
        if (isLeader) {
            return super.introduce().concat(" I am a student. I am the leader of class " + klassNumber + ".");
        }
        return klassNumber != 0 ? super.introduce().concat(" I am a student. I am in class " + klassNumber + ".") :
                super.introduce().concat(" I am a student.");
    }
}
