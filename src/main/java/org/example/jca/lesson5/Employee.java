package org.example.jca.lesson5;

public class Employee {
    private String surname;
    private String name;
    private String middleName;
    private String position;
    private String email;
    private long mobileNumber;
    private int salary;
    private int age;

    public Employee(String surname, String name, String middleName, String position, String email, long mobileNumber,
                    int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.age = age;

    }

    public void info() {
        System.out.println("ФИО сотрудника: " + surname + " " + name + " " + middleName);
        System.out.println();
        System.out.println("Должность: " + position);
        System.out.println("Почтовый адрес: " + email);
        System.out.println("Номер телефона: " + mobileNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }
}
