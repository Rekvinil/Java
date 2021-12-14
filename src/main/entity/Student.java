package main.entity;

public class Student {
    private int id;
    private String FIO;
    private double averageMark;

    public Student(int id, String FIO) {
        this.id = id;
        this.FIO = FIO;
        averageMark = 0;
    }

    public Student(int id, String FIO, double averageMark) {
        this.id = id;
        this.FIO = FIO;
        setAverageMark(averageMark);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        if(averageMark<0 || averageMark>5){
            throw new IllegalArgumentException("Неправильная оценка");
        }
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
