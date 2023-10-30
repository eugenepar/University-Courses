import humans.Student;
import humans.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jack","Sparrow",1);
        Student student1 = new Student("Tom","Hanks",1);
        Teacher teacher = new Teacher("Steven","Hokings","Computer Science");
        Courses course  = new Courses("Computer Science",teacher);
        EducationalInstitution educationalInstitution = new EducationalInstitution();
        educationalInstitution.addStudent(student);
        educationalInstitution.addStudent(student1);
        educationalInstitution.addCourse(course);
        System.out.println(educationalInstitution.getFullListOfStudents());
        System.out.println(teacher);



    }
}