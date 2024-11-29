package com.example.demo.model;

public class Address {

    private String addressId;
    private String addressName;

    private int studentNo;

    public Address() {
    }

    public Address(String addressId, String addressName, int studentNo) {
        this.addressId = addressId;
        this.addressName = addressName;
        this.studentNo = studentNo;
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

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", addressName='" + addressName + '\'' +
                ", studentNo=" + studentNo +
                '}';
    }
}
