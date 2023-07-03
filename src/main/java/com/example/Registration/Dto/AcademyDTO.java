package com.example.Registration.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AcademyDTO {

    private int  academyid;

    private String text;
    private String  tel;
    private String  url;
    private String  email;
    private String location;
    private String  textarea;

    public AcademyDTO(int academyid ,String text, String tel, String url, String email, String location, String textarea) {
        this.academyid=academyid;
        this.text = text;
        this.tel = tel;
        this.url = url;
        this.email = email;
        this.location = location;
        this.textarea = textarea;
    }

    public AcademyDTO() {
    }
    public int getAcademyid(){
        return academyid;
    }
    public void setAcademyid(int academyid){
        this.academyid=academyid;
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
        return "AcademyDTO{" +
                "academyid=" + academyid +
                "text='" + text + '\'' +
                ", tel='" + tel + '\'' +
                ", url='" + url + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", textarea='" + textarea + '\'' +
                '}';
    }
}
