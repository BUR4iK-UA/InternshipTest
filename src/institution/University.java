package institution;

import person.Student;

import java.util.LinkedList;
import java.util.List;

public class University {

    private String name;
    private List<Student> listStudents = new LinkedList<Student>();

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        listStudents.add(student);
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public int getAverageLevel() {
        double averageLevel = 0;
        for (Student student : listStudents) {
            averageLevel += student.getKnowledge().getLevel();
        }
        averageLevel = averageLevel / listStudents.size();
        return (int) averageLevel;
    }
}