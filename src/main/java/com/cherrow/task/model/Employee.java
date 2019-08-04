package com.cherrow.task.model;

import com.cherrow.task.utils.DateUtil;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Employee {

    public Employee(String lastName, String firstName, String birthDate, String emailAddress) {
        this.lastName = lastName.trim();
        this.firstName = firstName.trim();
        this.birthDate = birthDate.trim();
        this.emailAddress = emailAddress.trim();
    }

    private String lastName;

    private String firstName;

    private String birthDate;

    @Setter
    private String emailAddress;

    public boolean todayIsBirthday() {
        return DateUtil.isSameMonthDayWithNow(birthDate);
    }

    @Override
    public String toString() {
        return String.format("Name: %s,%s; Birthday: %s; Email: %s", lastName, firstName, birthDate, emailAddress);
    }
}
