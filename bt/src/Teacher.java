public class Teacher {
    private String id;
    private String fullName;
    private String email;
    private String title;

    /**
     * Teacher constructor
     * @param id maso
     * @param fullName hoten
     * @param email gmail
     * @param title chucvu
     */

    public Teacher(String id, String fullName, String email, String title) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Teacher: " + fullName + "\n"
                +"ID: "  + id + "\n"
                +"Email: " + email + "\n"
                +"Title: " + title;
    }
}
