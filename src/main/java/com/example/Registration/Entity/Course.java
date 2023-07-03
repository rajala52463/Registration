package com.example.Registration.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="course")
public class Course {

    @Id
    @Column(name="course_id",length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseid ;
    @Column(name="text",length=45)

    private String text;
    @Column(name="tel",length=20)
    private String  tel;
    @Column(name="url",length=255)
    private String  url;
    @Column(name="email",length=30)
    private String  email;
    @Column(name="location",length=45)
    private String location;
    @Column(name="textarea",length=255)
    private String  textarea;

    public Course(int courseid,String text, String tel, String url, String email, String location, String textarea) {
        this.courseid=courseid;
        this.text = text;
        this.tel = tel;
        this.url = url;
        this.email = email;
        this.location = location;
        this.textarea = textarea;
    }

    public Course() {
    }

    public int getCourseid(){
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTextarea() {
        return textarea;
    }

    public void setTextarea(String textarea) {
        this.textarea = textarea;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                "text='" + text + '\'' +
                ", tel='" + tel + '\'' +
                ", url='" + url + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", textarea='" + textarea + '\'' +
                '}';
    }
}
