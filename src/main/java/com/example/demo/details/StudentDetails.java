package com.example.demo.details;

import com.example.demo.model.Marks;
import com.example.demo.model.Subjects;

import java.math.BigDecimal;
import java.util.Map;

public class StudentDetails {

    private String studentName;
    private long age;
    private String addressId;
    private String addressName;
    private Map<Subjects, BigDecimal> subjectsMarksMap;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Map<Subjects, BigDecimal> getSubjectsMarksMap() {
        return subjectsMarksMap;
    }

    public void setSubjectsMarksMap(Map<Subjects, BigDecimal> subjectsMarksMap) {
        this.subjectsMarksMap = subjectsMarksMap;
    }
}
