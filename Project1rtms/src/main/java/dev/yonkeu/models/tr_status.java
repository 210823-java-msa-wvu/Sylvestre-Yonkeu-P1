package dev.yonkeu.models;

import javax.persistence.*;

@Entity
@Table(name = "tr_status")
public class tr_status {

    //Instamce variables
    //private String emp_id;
    private String status;
    private boolean grade_approved;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne
    @JoinColumn(name = "emp_id")
    private Users users;
    @OneToOne
    @JoinColumn(name = "tr_id")
    private tr_form tr_form;

    //constructors
    public tr_status() {
    }

    public tr_status(String status, boolean grade_approved, Users users, dev.yonkeu.models.tr_form tr_form) {
        this.status = status;
        this.grade_approved = grade_approved;
        this.users = users;
        this.tr_form = tr_form;
    }

    public tr_status(String status, boolean grade_approved, dev.yonkeu.models.tr_form tr_form) {
        this.status = status;
        this.grade_approved = grade_approved;
        this.tr_form = tr_form;
    }

    //Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isGrade_approved() {
        return grade_approved;
    }

    public void setGrade_approved(boolean grade_approved) {
        this.grade_approved = grade_approved;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public dev.yonkeu.models.tr_form getTr_form() {
        return tr_form;
    }

    public void setTr_form(dev.yonkeu.models.tr_form tr_form) {
        this.tr_form = tr_form;
    }

    @Override
    public String toString() {
        return "tr_status{" +
                "status='" + status + '\'' +
                ", grade_approved=" + grade_approved +
                ", users=" + users +
                ", tr_form=" + tr_form +
                '}';
    }


}
