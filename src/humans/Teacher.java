package humans;

import humans.People;

public class Teacher extends People {

    private String subject;

    public Teacher(String firstName,String lastName,String subject){
        super(firstName,lastName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "humans.Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
