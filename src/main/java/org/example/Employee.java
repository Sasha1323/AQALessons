package org.example;

import org.w3c.dom.ls.LSOutput;

public class Employee {
    private String fio;
    private String jobTitle;
    private String email;
    private String phone;
    private String salary;
    private Integer age;

    public Employee(String fio, String jobTitle, String email, String phone,String salary, Integer age) {
        this.fio = fio;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInformation() {
        System.out.println(
                fio + " " + jobTitle + " " + email + " " + phone + " " + salary + " " + age) ;
    }
}

