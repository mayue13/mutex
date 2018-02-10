package HumanWorkApp;

/**
 * Created by mayue on 07-Feb-18.
 */
public class Teacher extends HumanWork {

   private int teacherId;
    private String subjectName;
    private double salary;

    public Teacher(String name, String work, int teacherId, String subjectName, double salary) {
        this.name=name;
        this.work=work;
        this.teacherId = teacherId;
        this.subjectName = subjectName;
        this.salary = salary;
    }

    public Teacher() {

    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
