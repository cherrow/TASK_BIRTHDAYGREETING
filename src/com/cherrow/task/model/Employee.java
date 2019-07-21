package com.cherrow.task.model;

import com.cherrow.task.utils.DateHandler;

import java.util.Date;

public class Employee {

    public Employee(String lastName, String firstName, Date birthDate, String emailAddress){
        setLastName(lastName);
        setFirstName(firstName);
        setBirthDate(birthDate);
        setEmailAddress(emailAddress);
    }

    private String lastName;

    private String firstName;

    private Date birthDate;

    private String emailAddress;


    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean todayIsBirthday(){
        return DateHandler.isSameMonthDateWithNow(getBirthDate());
    }
}
