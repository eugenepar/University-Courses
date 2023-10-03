public class Teacher extends People {

    private String subject;

    Teacher(String firstName,String lastName,String subject){
        super(firstName,lastName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
