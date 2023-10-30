import humans.Student;
import humans.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jack","Sparrow",1);
        Student student1 = new Student("Tom","Hanks",2);
        Student student2 = new Student("Tim","Stevens",3);
        Teacher teacher = new Teacher("Steven","Hokings","Computer Science");
        Courses course  = new Courses("Computer Science",teacher,2);
        EducationalInstitution educationalInstitution = new EducationalInstitution();
        educationalInstitution.addStudent(student);
        educationalInstitution.addStudent(student1);
        educationalInstitution.addStudent(student2);
        educationalInstitution.addCourse(course);

        /**TEST: We are testing if the student can be added
        to the course based on the maxNumberOfStudents*/
        educationalInstitution.addStudentToCourse(student.getFirstName(),course.getCourseName());
        educationalInstitution.addStudentToCourse(student1.getFirstName(),course.getCourseName());
        educationalInstitution.addStudentToCourse(student2.getFirstName(),course.getCourseName());



    }
}