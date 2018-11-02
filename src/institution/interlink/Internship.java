package institution.interlink;

import person.Student;

import java.util.LinkedList;
import java.util.List;

public class Internship {

    private String name;
    private List<Student> listStudents = new LinkedList<Student>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        listStudents.add(student);
    }

    public void goToInternship(List<Student> listStudents, int averageLevel) {
        for (Student student: listStudents) {
            if (student.getKnowledge().getLevel() > averageLevel){
                setStudent(student);
            }
        }
    }

    public String getStudents() {
        String result = new String();
        for (Student student: listStudents) {
            result = result.concat(student.getName() + "\n");
        }
        return result;
    }
}
