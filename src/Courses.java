import humans.Student;
import humans.Teacher;

import java.util.ArrayList;

public class Courses {
    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> listOfStudents = new ArrayList<>();

    private int maxNumberOfStudents;

    Courses(String courseName,Teacher teacher,int maxNumberOfStudents){
        this.courseName = courseName;
        this.teacher = teacher;
        this.maxNumberOfStudents = maxNumberOfStudents;
    }
    Courses(String courseName,Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.maxNumberOfStudents = 5;

    }
    public Integer getMaxNumberOfStudents(){
        return this.maxNumberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getListOfStudents(){
        return listOfStudents;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", teacher=" + teacher +
                ", listOfStudents=" + listOfStudents +
                '}';
    }

    public void addStudent(Student student) {
        if (listOfStudents.size() < maxNumberOfStudents) {
            listOfStudents.add(student);
            System.out.println(student.getFirstName() + " has successfully been added to the course!");
        }
        else {
            System.out.println("The course "+ courseName  + " is full. Good luck next year!");
        }
    }
    public Boolean removeStudent(Student student) {
        return listOfStudents.remove(student);
    }
    public void printStudents(){
        for(Student student: listOfStudents){
            System.out.println(student.getFirstName() + " " +  student.getLastName());
        }

    }
}
