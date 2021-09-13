package org.example.jca.lesson5;

public class HomeworkLesson5 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov", "Ivan", "Ivanovich", "Engineer",
                "ivivan@mailbox.com", 89638527412L, 3000, 45);
        persArray[1] = new Employee("Orlov", "Pavel", "Pavlovich", "Teacher",
                "orlov@mailbox.com", 87418527412L, 2000, 37);
        persArray[2] = new Employee("Orlova", "Katerina", "Pavlovna", "Teacher",
                "orlova@mailbox.com", 88527417412L, 2000, 33);
        persArray[3] = new Employee("Petrova", "Oxsana", "Ivanovna", "Nurse",
                "petrova@mailbox.com", 89637417412L, 1500, 43);
        persArray[4] = new Employee("Kotova", "Alica", "Maksimovna", "Manager",
                "kotova@mailbox.com", 89637419632L, 1000, 40);
//        Employee[] employees = {
//                new Employee("Ivanov", "Ivan", "Ivanovich", "Engineer",
//                        "ivivan@mailbox.com", 89638527412l, 3000, 45),
//                new Employee("Orlov", "Pavel", "Pavlovich", "Teacher",
//                        "orlov@mailbox.com", 87418527412l, 2000, 37),
//                new Employee("Orlova", "Katerina", "Pavlovna", "Teacher",
//                        "orlova@mailbox.com", 88527417412l, 2000, 33),
//                new Employee("Petrova", "Oxsana", "Ivanovna", "Nurse",
//                        "petrova@mailbox.com", 89637417412l, 1500, 43),
//                new Employee("Kotova", "Alica", "Maksimovna", "Manager",
//                        "kotova@mailbox.com", 89637419632l, 1000, 40),
//        };
        for (Employee employee : persArray) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }
    }
}
