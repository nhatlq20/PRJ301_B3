/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author qnhat
 */
public class Student {


    /*
    -- Tạo bảng Student
CREATE TABLE Student (
    StudentID INT IDENTITY(1,1) PRIMARY KEY,
    FullName NVARCHAR(100) NOT NULL,
    Gender NVARCHAR(10) CHECK (Gender IN (N'Nam', N'Nữ')),
    DOB DATE NOT NULL,
    Email NVARCHAR(100) UNIQUE,
    Phone VARCHAR(15)
);
    
     */
    private String studentId, fullName, gender, dob, email, phone;

    public Student(String studentId, String fullName, String gender, String dob, String email, String phone) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", fullName=" + fullName + ", gender=" + gender + ", email=" + email + ", phone=" + phone + '}';
    }

}
