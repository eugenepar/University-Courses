import humans.Student;
import humans.Teacher;

import java.util.ArrayList;

public class Courses {
    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> listOfStudents = new ArrayList<>();

    Courses(String courseName,Teacher teacher){
        this.courseName = courseName;
        this.teacher = teacher;

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

    public void addStudent(Student student){
        listOfStudents.add(student);
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
