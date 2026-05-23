package com.prueba1.v1.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Long teacherId;

    @Column(name = "firstName", nullable = false, length = 30)
    private String firstName;

    @Column(name = "secondName", length = 30)
    private String secondName;

    @Column(name = "lastName", nullable = false, length = 30)
    private String lastName;

    @Column(name = "secondLastName", nullable = false, length = 30)
    private String secondLastName;

    @Column(name = "documentNumber", nullable = false, length = 30)
    private String documentNumber;

    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;

    @Column(name = "gmail", nullable = false, length = 30)
    private String gmail;

    @Column(name = "phoneNumber", nullable = false, length = 30)
    private String phoneNumber;

    @Column(name = "Academic_title", nullable = false, length = 40)
    private String academicTitle;

    @Column(name = "direction", nullable = false, length = 40)
    private String direction;

    @Column(name = "user_id")
    private Integer userId;

    // Constructor
    public Teacher() {}

    // Getters y Setters
    public Long getTeacherId() { return teacherId; }
    public void setTeacherId(Long teacherId) { this.teacherId = teacherId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getSecondName() { return secondName; }
    public void setSecondName(String secondName) { this.secondName = secondName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSecondLastName() { return secondLastName; }
    public void setSecondLastName(String secondLastName) { this.secondLastName = secondLastName; }

    public String getDocumentNumber() { return documentNumber; }
    public void setDocumentNumber(String documentNumber) { this.documentNumber = documentNumber; }

    public LocalDate getBirthdate() { return birthdate; }
    public void setBirthdate(LocalDate birthdate) { this.birthdate = birthdate; }

    public String getGmail() { return gmail; }
    public void setGmail(String gmail) { this.gmail = gmail; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAcademicTitle() { return academicTitle; }
    public void setAcademicTitle(String academicTitle) { this.academicTitle = academicTitle; }

    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }
}