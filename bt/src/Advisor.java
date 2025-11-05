public class Advisor {
    private String fullName;
    private String email;

    /**
     * Advisor constructor
     * @param fullName hoten
     * @param email gmail
     */

    public Advisor(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Advisor: " + fullName + "\n"
                + " Email: " + email;
    }
}
