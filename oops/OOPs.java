public class OOPs {
    public static void main(String[] args) {             // main class
        Student s1 = new Student();                     // creating object of class Student
        s1.name = "Aditya";
        s1.age = 20;
        s1.printinfo();
    }
}
class Student {                                    // class Student

    String name;
    int age;

    Student() {                                         // constructor
        System.out.println("Constructor has been called");

    }
    public void printinfo() {                           // method 
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
