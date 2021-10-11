package dev.yonkeu.models;

import javax.persistence.*;

@Entity
@Table(name = "tr_form")
public class tr_form {
    //Instance Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tr_id;

    private String first_name;
    private String last_name;
    private Integer created_date;
    private Integer created_time;
    private String location;
    private String description;
    private Integer course_cost;
    private String grade_format;
    private String event_type;
    private Integer work_time_missed;
    private Integer projected_reimbursement;

    @OneToOne
    @JoinColumn(name = "emp_id")
    private Users users;
    //Constructors
    public tr_form() {
    }

    public tr_form(Integer tr_id, String first_name, String last_name, Integer created_date, Integer created_time, String location, String description, Integer course_cost, String grade_format, String event_type, Integer work_time_missed, Integer projected_reimbursement, Users users) {
        this.tr_id = tr_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.created_date = created_date;
        this.created_time = created_time;
        this.location = location;
        this.description = description;
        this.course_cost = course_cost;
        this.grade_format = grade_format;
        this.event_type = event_type;
        this.work_time_missed = work_time_missed;
        this.projected_reimbursement = projected_reimbursement;
        this.users = users;
    }

    public tr_form(String first_name, String last_name, Integer created_date, Integer created_time, String location, String description, Integer course_cost, String grade_format, String event_type, Integer work_time_missed, Integer projected_reimbursement, Users users) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.created_date = created_date;
        this.created_time = created_time;
        this.location = location;
        this.description = description;
        this.course_cost = course_cost;
        this.grade_format = grade_format;
        this.event_type = event_type;
        this.work_time_missed = work_time_missed;
        this.projected_reimbursement = projected_reimbursement;
        this.users = users;
    }

    //Getters and Setters
    public Integer getTr_id() {
        return tr_id;
    }

    public void setTr_id(Integer tr_id) {
        this.tr_id = tr_id;
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

    public Integer getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Integer created_date) {
        this.created_date = created_date;
    }

    public Integer getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Integer created_time) {
        this.created_time = created_time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCourse_cost() {
        return course_cost;
    }

    public void setCourse_cost(Integer course_cost) {
        this.course_cost = course_cost;
    }

    public String getGrade_format() {
        return grade_format;
    }

    public void setGrade_format(String grade_format) {
        this.grade_format = grade_format;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public Integer getWork_time_missed() {
        return work_time_missed;
    }

    public void setWork_time_missed(Integer work_time_missed) {
        this.work_time_missed = work_time_missed;
    }

    public Integer getProjected_reimbursement() {
        return projected_reimbursement;
    }

    public void setProjected_reimbursement(Integer projected_reimbursement) {
        this.projected_reimbursement = projected_reimbursement;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "tr_form{" +
                "tr_id=" + tr_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", created_date=" + created_date +
                ", created_time=" + created_time +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", course_cost=" + course_cost +
                ", grade_format='" + grade_format + '\'' +
                ", event_type='" + event_type + '\'' +
                ", work_time_missed=" + work_time_missed +
                ", projected_reimbursement=" + projected_reimbursement +
                ", users=" + users +
                '}';
    }
}
