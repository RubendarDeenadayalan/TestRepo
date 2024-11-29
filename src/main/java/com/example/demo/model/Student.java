package com.example.demo.model;

import java.util.List;
import java.util.Set;

public class Student {
    private int studentNo;
    private String studentName;
    private long age;

    private Address address;

    private Set<Subjects> subjects;
    private Marks marks;

    public Student() {
    }

    public Student(int studentNo, String studentName, long age, Address address,  Set<Subjects>  subjects, Marks marks) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.age = age;
        this.address = address;
        this.subjects = subjects;
        this.marks = marks;
    }



    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public Set<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subjects> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", subjects=" + subjects +
                ", marks=" + marks +
                '}';
    }
}
