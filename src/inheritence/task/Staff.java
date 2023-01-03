package inheritence.task;

import inheritence.task.School;

public class Staff {
    private School school;
    private int salary;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Staff(School school, int salary) {
        this.school = school;
        this.salary = salary;
    }

}
