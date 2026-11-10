package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private long employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(long employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public Employee() {

    }


    // totalpay, regular hours, overtimehours

    public double getTotalPay() {
        double totalPay=0;
        totalPay = payRate * hoursWorked;
        return totalPay;
    }
    public double getRegularHours(double totalPay) {
        double regularHours = 0;
        regularHours = totalPay / payRate;
        return regularHours;
    }
    public double getOvertimeHours(double regularHours) {
        double overtimeHours = 0;
        overtimeHours = hoursWorked - regularHours;
        return overtimeHours;
    }

    private int startTime;
    public void punchIn(int time) {
        this.startTime = time;
    }
    public void punchOut(int outTime) {
        hoursWorked = outTime - this.startTime;
    }
    public void punchIn() {
        LocalTime start = LocalTime.now();
        int hour = start.getHour();
//        punchIn(hour);
        this.startTime = hour;
    }
    public void punchOut() {
        LocalTime start = LocalTime.now();
        int outTime = start.getHour();

        hoursWorked = outTime - this.startTime;
    }





}
