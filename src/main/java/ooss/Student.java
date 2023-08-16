package ooss;

public class Student extends Person {

    private int klassNumber;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public void join(Klass klass) {
        klassNumber = klass.getNumber();
    }

    public boolean isIn(Klass klass) {
        return klass.getNumber() == klassNumber;
    }

    @Override
    public String introduce() {
        return klassNumber != 0 ? super.introduce().concat(" I am a student. I am in class " + klassNumber + ".") :
                super.introduce().concat(" I am a student.");
    }
}
