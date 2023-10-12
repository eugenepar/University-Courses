import humans.Student;

import java.util.ArrayList;

public class EducationalInstitution {
    private ArrayList<Courses> listOfCourses = new ArrayList<>();
    private ArrayList<Student> listOfStudents = new ArrayList<>();


    public void addStudent(Student student){
        listOfStudents.add(student);
    }
    public Boolean removeStudent(Student student) {
        return listOfStudents.remove(student);
}

    public void addCourse(Courses course){
        listOfCourses.add(course);
    }
    public Boolean removeCourse(Courses course){
        return listOfCourses.remove(course);
    }

    public String addStudentToCourse(String studentName, String courseName){
        Student expectedStudent  = null;
        Courses expectedCourse = null;
        boolean studentFlag = false;
        boolean courseFlag = false;
        for(Student student: listOfStudents){
            if(student.getFirstName().equalsIgnoreCase(studentName)){
                expectedStudent = student;
                studentFlag = true;

            }
        }
//        Student expectedStudent2 = listOfStudents.stream().filter(student -> student.getFirstName().equalsIgnoreCase(studentName)).findFirst().orElse(null);
//        if (expectedStudent2 == null){
//            return "Error. This student is not in the list";
//        }
        if(!studentFlag){
            return "Error. This student is not in the list";
        }
        for (Courses course: listOfCourses){
            if(course.getCourseName().equalsIgnoreCase(courseName)){
                expectedCourse = course;
                courseFlag = true;
            }
        }
        if(!courseFlag){
            return "Error.This course is not the the list of courses!";
        }
        expectedCourse.addStudent(expectedStudent);
        return "The student has been added to the course!";
    }
}
