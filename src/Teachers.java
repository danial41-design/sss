public class Teachers extends Person{
    String subject;
    int yearsOfExperience;
    int salary;

    public Teachers() {
        super();
    }

    public Teachers(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void giveRaise(int percent) {
        salary = salary + (salary / 100 * percent);
    }


    @Override
    public String toString() {
        return "I teach " + subject + "\n";

    }
}