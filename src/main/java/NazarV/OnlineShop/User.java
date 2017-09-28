package NazarV.OnlineShop;

import java.time.LocalDate;

public class User extends Person  {
    private String userId;
    private String password;
    private  String login;
    private String email;

    public User(String personId, String name, String surname, LocalDate birthDay,
                String userId, String password, String login, String email) {
        super(personId, name, surname, birthDay);
        this.userId = userId;
        this.password = password;
        this.login = login;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
