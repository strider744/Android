package com.strider.android.firsttask;

public class Task {

    public static void main() {
        Employee employee = new Employee(7, "Developer");
        System.out.println("Task1 " + employee.getId());
        System.out.println("Task1 " + employee.getVacancy());
    }
}
