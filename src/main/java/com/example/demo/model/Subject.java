package com.example.demo.model;

import java.util.List;

public class Subject {

    private List<Subjects> subjects;
    private int studentNo;

    public Subject() {
    }

    public Subject(List<Subjects> subjects, int studentNo) {
        this.subjects = subjects;
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjects=" + subjects +
                ", studentNo=" + studentNo +
                '}';
    }
}
