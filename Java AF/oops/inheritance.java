class Employee {
    int salary = 60000;
}
class Engineer extends Employee {
    int benefits = 10000;
}
class Faang {
    public static void main(String[] args) {
        Engineer E1 = new Engineer();
        System.out.println("Salary: " + E1.salary);
        System.out.println("Benefits: " + E1.benefits);

    }
}
