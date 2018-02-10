package HumanWorkApp;

/**
 * Created by mayue on 07-Feb-18.
 */
public class Student extends HumanWork {

   private int rollNumber;
    private String className;

    public Student(String name, String work, int rollNumber, String className) {
        this.name=name;
        this.work=work;
        this.rollNumber = rollNumber;
        this.className = className;
    }

    public Student() {

    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
