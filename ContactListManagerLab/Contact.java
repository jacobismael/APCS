public class Contact{
    private String firstName;
    private String lastName;
    private String email;

    public Contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String toString() {
        return firstName + " " + lastName + ": " + email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        int st = email.indexOf('@');
        return email.substring(0, st);
    }

    public String getDomain() {
        int st = email.indexOf('@');
        int st2 = email.lastIndexOf('.');
        return email.substring(st+1, st2);
    }

    public String getDomainExtension() {
        int st = email.lastIndexOf('.');
        return email.substring(st+1);
    }
	
}
