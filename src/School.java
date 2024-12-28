import java.util.ArrayList;
import java.util.Collections;
public class School {
    private ArrayList<Person> members = new ArrayList<>();

    public ArrayList<Person> getMembers() {
        return members;
    }
    public void addMember(Person member) {
        members.add(member);
    }
    public ArrayList<Students> getStudents() {
        ArrayList<Students> students = new ArrayList<>();
        for (Person member : members) {
            if (member instanceof Students) {
                students.add((Students) member);
            }
        }
        return students;
    }
    public ArrayList<Teachers> getTeachers() {
        ArrayList<Teachers> teachers = new ArrayList<>();

        for (Person person : members) {
            if (person instanceof Teachers) {
                teachers.add((Teachers) person);
            }
        }

        return teachers;
    }
    public void sortMembersBySurname() {
        for (int i = 0; i < members.size() - 1; i++) {
            for (int j = 0; j < members.size() - i - 1; j++) {
                if (members.get(j).getSurname().charAt(0) > members.get(j+1).getSurname().charAt(0)) {
                    Collections.swap(members, j, j+1);
                }
            }
        }
    }
    @Override
    public String toString() {
        String result = "";

        for (Person member : members) {
            result += member;
        }

        return result;
    }
}
