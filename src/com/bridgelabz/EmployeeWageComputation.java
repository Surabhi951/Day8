package com.bridgelabz;

public class EmployeeWageComputation {
    static final int IS_FULL_TIME = 1;

    static int checkAttendence() {
        return (int) (Math.random() * 10) % 3;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee computation program");
        int attendence;
        attendence = checkAttendence();
        if (attendence == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
