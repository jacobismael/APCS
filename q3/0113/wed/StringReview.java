public class StringReview {
    private String fullname;

    public StringReview(String name) {
        this.fullname = name;
    }

    public String getLastName() {
        int st = fullname.lastIndexOf('.');
        return fullname.substring(st + 1);
    }

    public String toString() {
        int st1 = fullname.indexOf('.');
        String firstname = fullname.substring(0, st1);
        int st2 = fullname.lastIndexOf('.');
        String middlename = fullname.substring(st1+1, st2);
        
        return firstname + " " + middlename + " " + getLastName();
    }
}