


package com.example.w22st200493341assign1;

public class Student {

    private String firstname;
    private String lastname;
    private int studentNumber;

    // constructor
    public Student (String fName,String lName,int stuNum)
    {
        firstname=fName;
        lastname=lName;
        studentNumber=stuNum;


    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }



}
