package Activity6.building;

public class Student extends Person {

    private int yrLevel;

    public Student(String name, int age, String gender, int yrLevel) {
        super(name, age, gender);
        this.yrLevel = yrLevel;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.getName() + " and I am a " + this.yrLevel + "student.");
    }

    public int getYrLevel() {
        return yrLevel;
    }

    public void setYrLevel(int yrLevel) {
        this.yrLevel = yrLevel;
    }

}
