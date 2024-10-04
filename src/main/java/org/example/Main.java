package org.example;

public class Main {
    private static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        addEmployeesToArray();
    }

    private static void addEmployeesToArray() {
        employees[0] = new Employee("Belyakova AC", "QA", "shkajsh@gmail.com", "+(23)6572656", "10000$", 23);
        employees[1] = new Employee("Ivanov AC", "QC", "feuhr@gmail.com", "+(23)34534", "11000$", 24);
        employees[2] = new Employee("Vinov AC", "TO", "fgrht@gmail.com", "+(23)78978", "12000$", 25);
        employees[3] = new Employee("Soloviov AC", "BA", "tjtyjyt@gmail.com", "+(23)566565", "13000$", 26);
        employees[4] = new Employee("Lostov AC", "Dev", "ghjyjty@gmail.com", "+(23)122112", "14000$", 27);
    }
}