package com.example.demo.model;

import java.math.BigDecimal;

public class Marks {
    private BigDecimal physicsMark;
    private BigDecimal chemistryMark;
    private BigDecimal mathsMark;

    private int studentNo;

    public Marks() {

    }

    public Marks(BigDecimal physicsMark, BigDecimal chemistryMark, BigDecimal mathsMark, int studentNo) {
        this.physicsMark = physicsMark;
        this.chemistryMark = chemistryMark;
        this.mathsMark = mathsMark;
        this.studentNo = studentNo;
    }

    public BigDecimal getPhysicsMark() {
        return physicsMark;
    }

    public void setPhysicsMark(BigDecimal physicsMark) {
        this.physicsMark = physicsMark;
    }

    public BigDecimal getChemistryMark() {
        return chemistryMark;
    }

    public void setChemistryMark(BigDecimal chemistryMark) {
        this.chemistryMark = chemistryMark;
    }

    public BigDecimal getMathsMark() {
        return mathsMark;
    }

    public void setMathsMark(BigDecimal mathsMark) {
        this.mathsMark = mathsMark;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "physicsMark=" + physicsMark +
                ", chemistryMark=" + chemistryMark +
                ", mathsMark=" + mathsMark +
                ", studentNo=" + studentNo +
                '}';
    }
}
