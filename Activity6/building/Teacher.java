package Activity6.building;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.getName() + " and I will be teaching you " + this.subject + ".");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
