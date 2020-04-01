public class User {
    private String Name, lastName, email, password;
    private String emailGuest;


    public User(String name, String lastName, String email, String password) {
        Name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public User(String emailGuest) {
        this.emailGuest = emailGuest;
    }


}
