package main.service;

import main.Storage;
import main.entity.Student;

import java.util.Iterator;
import java.util.List;

public class StudentService {
    public void addStudent(Student student){
        Storage.getInstance().addStudents(student);
    }

    public void changeStudent(Student student){
        Student student1 = findStudent(student.getId());
        if(student1!=null){
            student1.setId(student.getId());
            student1.setFIO(student.getFIO());
            student1.setAverageMark(student.getAverageMark());
        }
    }

    public void deleteStudent(int id){
        List<Student> students = Storage.getInstance().getStudents();
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getId()==id){
                iterator.remove();
            }
        }
    }

    public Student findStudent(int id){
        List<Student> students = Storage.getInstance().getStudents();
        for(Student student : students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }
}
