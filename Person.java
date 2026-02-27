public class Person {
    
    private String firstname;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

     public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

     public String toString() {
        return firstName + " " + lastName + "/" gender;
    }

    public boolean equals(Person p) {
    if (this.firstName.equals(p.firstName)
        && this.lastName.equals(p.lastName)
        && this.gender.equals(p.gender)) {
        return true;
    } else {
        return false;
    }
}


}
