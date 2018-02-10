package HumanWorkApp;


public class Employee extends HumanWork {

    private double salary;
    private int empId;


    public Employee(String name, String work, double salary, int empId) {
            this.name=name;
            this.work=work;
            this.salary = salary;
            this.empId = empId;
    }

    public Employee() {

    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }


}
