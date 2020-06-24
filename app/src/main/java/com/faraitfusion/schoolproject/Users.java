package com.faraitfusion.schoolproject;

public class Users {
    private String name, phone, fathername,roll,cls,password;

    public Users() {

    }

    public Users(String name, String phone, String fathername, String roll, String cls, String password) {
        this.name = name;
        this.phone = phone;
        this.fathername = fathername;
        this.roll = roll;
        this.cls = cls;
this.password=password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername= fathername;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String address) {
        this.roll = roll;
    }
    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }
    public String getPassword() {
        return name;
    }

    public void setPassword(String password) {
        this.name = password;
    }

}
