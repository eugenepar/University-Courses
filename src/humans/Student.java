package humans;

import humans.People;

public class Student extends People {

    private int studentTicketId;

    public Student(String firstName,String lastName,int studentTicketId){
        super(firstName,lastName);
        this.studentTicketId = studentTicketId;
    }



    public int getStudentTicketId() {
        return this.studentTicketId;
    }



    @Override
    public String toString() {
        return "humans.Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", studentTicketId=" + studentTicketId +
                '}';
    }
}
