package dev.yonkeu.models;

import javax.persistence.*;

@Entity
@Table(name = "users")

public class Users {

    //Instance Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emp_id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String title;
    @Column
    private Integer admin_level;

    //Constructors
    public Users() {
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Users(Integer emp_id, String first_name, String last_name, String title, Integer admin_level) {
        this.emp_id = emp_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.title = title;
        this.admin_level = admin_level;
    }

    //Getters and Setters
    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAdmin_level() {
        return admin_level;
    }

    public void setAdmin_level(Integer admin_level) {
        this.admin_level = admin_level;
    }

    @Override
    public String toString() {
        return "users{" +
                "emp_id=" + emp_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", title='" + title + '\'' +
                ", admin_level=" + admin_level +
                '}';
    }
}
