package com.company;

public class Employee {

    private String firstname;
    private String lastName;

    public Employee(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "\n["+this.firstname+","+this.lastName+","+"]";
    }
}

