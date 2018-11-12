package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.List;

public class  Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", new Knowledge(12)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(7)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(9)));
        university.addStudent(new Student("Vova Krip", new Knowledge(10)));
        university.addStudent(new Student("Julia Mur", new Knowledge(2)));
        university.addStudent(new Student("Igor Perechrest", new Knowledge(5)));

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Burko Bogdan", new Knowledge(12)));
        studentList.add(new Student("Galam Bogdan", new Knowledge(10)));
        studentList.add(new Student("Dudik Nazar", new Knowledge(7)));

        university.addStudents(studentList);

        Internship internship = new Internship("Interlink");
        internship.addToInternship(university.getListStudents(), university.getAverageLevel());
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
