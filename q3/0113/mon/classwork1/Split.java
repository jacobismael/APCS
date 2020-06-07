public class Split {
    private String email;

    public Split(String text) {
        this.email = text;
    }

    public String getName() {
        int index = email.indexOf('@');
        return email.substring(0, index);
    }

    public String getDomain() {
        int index = email.indexOf('@');
        return email.substring(index);
    }

    public String getLastNameMVLA(String email) {
        int index1 = email.indexOf('.');
        int index2 = email.indexOf('@');
        return email.substring(index1, index2);
    }

    public String toString() {
        return "address: " + email;
    }

    
}