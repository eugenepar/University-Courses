import java.util.ArrayList;

public class Courses {
    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> listOfStudents;

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
}
