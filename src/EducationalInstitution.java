import humans.Student;

import java.util.ArrayList;

public class EducationalInstitution {
    private ArrayList<Courses> listOfCourses = new ArrayList<>();
    private ArrayList<Student> listOfStudents = new ArrayList<>();


    public void addStudent(Student student) {
        if(canAddStudentToList(student.getStudentTicketId())){
            listOfStudents.add(student);
            System.out.println(student.getFirstName() + " has been added");
        }
        else {
            System.out.println("We can't add this student to our Institution because this ID already exists: " + student.getStudentTicketId());
        }

    }

    public Boolean removeStudent(Student student) {
        return listOfStudents.remove(student);
    }

    public void addCourse(Courses course) {
        listOfCourses.add(course);
    }

    public Boolean removeCourse(Courses course) {
        return listOfCourses.remove(course);
    }

    public String addStudentToCourse(String studentName, String courseName) {
        Student expectedStudent = null;
        Courses expectedCourse = null;
        boolean studentFlag = false;
        boolean courseFlag = false;
        for (Student student : listOfStudents) {
            if (student.getFirstName().equalsIgnoreCase(studentName)) {
                expectedStudent = student;
                studentFlag = true;

            }
        }
//        Student expectedStudent2 = listOfStudents.stream().filter(student -> student.getFirstName().equalsIgnoreCase(studentName)).findFirst().orElse(null);
//        if (expectedStudent2 == null){
//            return "Error. This student is not in the list";
//        }
        if (!studentFlag) {
            return "Error. This student is not in the list";
        }
        for (Courses course : listOfCourses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                expectedCourse = course;
                courseFlag = true;
            }
        }
        if (!courseFlag) {
            return "Error.This course is not the the list of courses!";
        }
        expectedCourse.addStudent(expectedStudent);
        return "The student has been added to the course!";
    }

    private boolean canAddStudentToList(int studentTicketId) {
//        for (int i = 0; i < listOfStudents.size(); i++) {
//            if (studentTicketId == listOfStudents.get(i).getStudentTicketId()) {
//                return false;
//            }
//        }
//        return true;



//        We are going to realize this AWESOME method with the help of For Each method:
//         for(Student student: listOfStudents){
//             if(student.getStudentTicketId() == studentTicketId){
//                 return false;
//             }
//         }
//         return true;

//        We are going to use Streams
        return  listOfStudents.stream().noneMatch(student -> student.getStudentTicketId() == studentTicketId);

    }

    public ArrayList<Student> getFullListOfStudents(){
        return listOfStudents;
    }

}
