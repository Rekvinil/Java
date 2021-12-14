package main.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    private int id;
    private String name;
    private List<Student> students;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        students = new ArrayList<>();
    }

    public Group(int id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public double calculateAverageMark(){
        if(students.size()!=0){
            double mark = 0;
            for (Student student : students){
                mark += student.getAverageMark();
            }
            return mark/students.size();
        } else{
            System.out.println("В группе студентов нет");
            return -1;
        }
    }

    public void addStudents(Student... students){ //vararg
        this.students.addAll(Arrays.asList(students));
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
