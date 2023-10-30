package humans;

public class People {
    protected String firstName;
    protected String lastName;

    People(String firstName,String lastName) throws Exception {
        if(firstName.length() > 0 && lastName.length() > 0) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        else {
            throw new Exception("The first or last name isn't valid");
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
