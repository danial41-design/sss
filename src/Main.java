import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();

        Scanner scanner = new Scanner(new File("C:\\Users\\aser\\IdeaProjects\\sss\\src\\Students"));

        while (scanner.hasNextLine()) {
            Students student = new Students();

            student.setName(scanner.next());
            student.setSurname(scanner.next());
            student.setAge(Integer.parseInt(scanner.next()));
            student.setGender(scanner.next() == "Male");

            while(scanner.hasNextInt()) {
                student.addGrade(Integer.parseInt(scanner.next()));
            }

            school.addMember(student);
        }

        scanner = new Scanner(new File("C:\\Users\\aser\\IdeaProjects\\sss\\src\\Teachers"));
        while (scanner.hasNextLine()) {
            Teachers teacher = new Teachers();

            teacher.setName(scanner.next());
            teacher.setSurname(scanner.next());
            teacher.setAge(Integer.parseInt(scanner.next()));
            teacher.setGender(scanner.next() == "Male");
            teacher.setSubject(scanner.next());
            teacher.setYearsOfExperience(Integer.parseInt(scanner.next()));
            teacher.setSalary(Integer.parseInt(scanner.next()));

            school.addMember(teacher);
        }
        school.sortMembersBySurname();
        System.out.println(school);

        for (Teachers teacher : school.getTeachers()) {
            if (teacher.getYearsOfExperience()>10){
                teacher.giveRaise(50);
                System.out.println("Becouse " + teacher.getName() + " is working in school more than 10 years, they receive 50% increase in salary. Their salary is \" + teacher.getSalary() + \" now.\"");
            }
        }

        for (Students student : school.getStudents()) {
            System.out.println(student.getName() + "'s GPA is " + student.getGpa());
        }

    }
}