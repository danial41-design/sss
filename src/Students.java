import java.util.ArrayList;

public class Students extends Person {


    ArrayList<Integer> grades = new ArrayList<>();
    float gpa;


    public Students(String name, String surname, int age, boolean gender, ArrayList<Integer> grades, float gpa) {
        super(name, surname, age, gender);
        this.grades = grades;
        this.gpa = gpa;
    }

    public Students(){ }
    public void addGrade(int grade) {
        grades.add(grade);
        calculateGpa();
    }



    private void calculateGpa() {
        float intsum = 0;
        float sum = 0;
        for(Integer grade:grades) {
            intsum += grade;
        }
        sum = intsum / grades.size();
        gpa = (float) (sum * 0.04);
    }
    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "I'm student with id " + id;
    }
}

