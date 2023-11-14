import humans.Student;
import humans.Teacher;

import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        EducationalInstitution educationalInstitution = new EducationalInstitution();

        boolean flag = true;
        while (flag) {
            System.out.println("--------------MENU-----------------");
            System.out.println("1.Add Student");
            System.out.println("2.Get the full list of Students");
            System.out.println("3.Add Course");
            System.out.println("4.Get the full list of Courses: ");
            System.out.println("5. Add Student to Course:");
            System.out.println("6.Exit");
            String options = scanner.nextLine();
            switch (options) {
                case "1" -> AddStudent(educationalInstitution);
                case "2" -> System.out.println(educationalInstitution.getFullListOfStudents());
                case "3" -> AddCourse(educationalInstitution);
                case "4" -> System.out.println(educationalInstitution.getTheFullListOfCourse());
                case "5" -> AddStudentToCourse(educationalInstitution);
                case "6" -> flag = false;
                default -> System.out.println("invalid input!");
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

    public static void  AddCourse(EducationalInstitution educationalInstitution) throws Exception {
        System.out.println("Please enter the first name of a teacher: ");
        String teacherFirstName = scanner.nextLine();
        System.out.println("Please enter the last name of a teacher: ");
        String teacherLastName = scanner.nextLine();
        System.out.println("Enter a subject: ");
        String subject = scanner.nextLine();

        Teacher teacher = new Teacher(teacherFirstName,teacherLastName,subject);

        System.out.println("Please enter a course name: ");
        String courseName = scanner.nextLine();

        System.out.println("Please enter the number of students on this course: ");
        int numberOfStudentsOnCourse = scanner.nextInt();
        scanner.nextLine();

        Courses courses = new Courses(courseName,teacher,numberOfStudentsOnCourse);
        educationalInstitution.addCourse(courses);

    }
    public static void AddStudentToCourse(EducationalInstitution educationalInstitution){
        System.out.println("Enter a student's name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter a course name");
        String courseName = scanner.nextLine();
        String result = educationalInstitution.addStudentToCourse(studentName,courseName);
        System.out.println(result);

    }



}