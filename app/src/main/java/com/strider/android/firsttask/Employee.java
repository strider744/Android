package com.strider.android.firsttask;

public class Employee {

    private final long id;
    private final Vacancy vacancy;

    Employee(long id, String name) {
        this.id = id;
        this.vacancy = new Vacancy(name);
    }

    String getVacancy() {
       return vacancy.getVacancy();
    }

    public long getId() {
        return id;
    }
}
