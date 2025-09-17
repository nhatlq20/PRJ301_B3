/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Domain model representing a Student entity mapped to the database table
 * {@code Student}.
 *
 * <p>Fields correspond to columns in the table and are exposed via standard
 * getters/setters for use across DAO, Controller, and JSP layers.</p>
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
    /**
     * Unique identifier of the student. In database it's {@code StudentID}.
     */
    private String studentId;

    /** Full name of the student (DB column: {@code FullName}). */
    private String fullName;

    /** Gender of the student (DB column: {@code Gender}). */
    private String gender;

    /** Date of birth in ISO format yyyy-MM-dd (DB column: {@code DOB}). */
    private String dob;

    /** Email address (DB column: {@code Email}). */
    private String email;

    /** Phone number (DB column: {@code Phone}). */
    private String phone;

    /**
     * Constructs a new {@link Student} with all fields populated.
     *
     * @param studentId unique identifier
     * @param fullName student's full name
     * @param gender student's gender
     * @param dob date of birth (yyyy-MM-dd)
     * @param email email address
     * @param phone phone number
     */
    public Student(String studentId, String fullName, String gender, String dob, String email, String phone) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
    }

    /** @return the unique identifier */
    public String getStudentId() {
        return studentId;
    }

    /** @param studentId sets the unique identifier */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /** @return date of birth (yyyy-MM-dd) */
    public String getDob() {
        return dob;
    }

    /** @param dob sets date of birth (yyyy-MM-dd) */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /** @return full name */
    public String getFullName() {
        return fullName;
    }

    /** @param fullName sets full name */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /** @return gender */
    public String getGender() {
        return gender;
    }

    /** @param gender sets gender */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /** @return email */
    public String getEmail() {
        return email;
    }

    /** @param email sets email */
    public void setEmail(String email) {
        this.email = email;
    }

    /** @return phone */
    public String getPhone() {
        return phone;
    }

    /** @param phone sets phone */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", fullName=" + fullName + ", gender=" + gender + ", email=" + email + ", phone=" + phone + '}';
    }

}
