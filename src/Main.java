import humans.Student;
import humans.Teacher;

import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Student student = new Student("Jack", "Sparrow", 1);
        Student student1 = new Student("Tom", "Hanks", 2);
        Student student2 = new Student("Tim", "Stevens", 3);
        Teacher teacher = new Teacher("Steven", "Hokings", "Computer Science");
        Courses course = new Courses("Computer Science", teacher, 2);
        EducationalInstitution educationalInstitution = new EducationalInstitution();
//        educationalInstitution.addStudent(student);
//        educationalInstitution.addStudent(student1);
//        educationalInstitution.addStudent(student2);
//        educationalInstitution.addCourse(course);

        /**TEST: We are testing if the student can be added
         to the course based on the maxNumberOfStudents*/
//        educationalInstitution.addStudentToCourse(student.getFirstName(),course.getCourseName());
//        educationalInstitution.addStudentToCourse(student1.getFirstName(),course.getCourseName());
//        educationalInstitution.addStudentToCourse(student2.getFirstName(),course.getCourseName());
        boolean flag = true;
        while (flag) {
            System.out.println("--------------MENU-----------------");
            System.out.println("1.Add Student");
            System.out.println("2.Get the full list of Students");
            System.out.println("3.Exit");
            String options = scanner.nextLine();
            switch (options) {
                case "1":
                    AddStudent(educationalInstitution);
                    break;
                case "2":
                    System.out.println(educationalInstitution.getFullListOfStudents());
                    break;
                case "3": flag = false;
                break;

            }
        }
    }

    public static void AddStudent(EducationalInstitution educationalInstitution) throws Exception {
        System.out.println("Please enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Please enter Student Ticket Id: ");
        int studentTicketId = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(firstName,lastName,studentTicketId);
        educationalInstitution.addStudent(student);
    }


}