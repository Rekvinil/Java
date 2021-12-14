package main;

import main.entity.Group;
import main.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Storage {

    private static Storage storage;

    private List<Student> students = new ArrayList<>();
    private List<Group> groups = new ArrayList<>();

    private Storage(){}

    public static Storage getInstance(){
        if(storage == null){
            storage = new Storage();
        }
        return storage;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addStudents(Student... students){
        this.students.addAll(Arrays.asList(students));
    }

    public void addGroups(Group... groups){
        this.groups.addAll(Arrays.asList(groups));
    }
}
