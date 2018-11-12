package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.LinkedList;
import java.util.List;

public class University {

    private String name;
    private List<Student> listStudents;

    public University(String name) {
        this.name = name;
        listStudents = new LinkedList<Student>();
    }

    public void addStudent(Student student){
        listStudents.add(student);
    }

    public void addStudents(List<Student> listStudents){
        this.listStudents.addAll(listStudents);
    }

    public List<Student> getListStudents(){
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents){
        this.listStudents = listStudents;
    }

    public int getAverageLevel(){

        if (listStudents.isEmpty()){
            return 0;
        }

        double averageLevel = 0;
        for (Student student : listStudents){
            averageLevel += student.getKnowledge().getLevel();
        }
        averageLevel = averageLevel / listStudents.size();
        return (int) averageLevel;
    }
}