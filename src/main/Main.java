package main;

import main.entity.Group;
import main.entity.Student;

public class Main {
    public static void main(String[] args) {
        Storage storage = Storage.getInstance();
        Student student1 = new Student(1, "Иванов Иван Иванович", 4.5);
        Student student2 = new Student(1, "Тимохин Иван Анатольевич", 3.5);
        Student student3 = new Student(1, "Антонов Владислав Васильевич", 4);
        Student student4 = new Student(1, "Антонова Мария Сергеевна", 5);
        Group group1 = new Group(1, "ifst");
        group1.addStudents(student1, student2, student3, student4);
        storage.addGroups(group1);
        storage.addStudents(student1, student2, student3, student4);
    }
}
