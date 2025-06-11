public class paraoop {                     
    public static void main(String[] args) {             
        Student s1 = new Student("Rohit" , 81);
        s1.printinfo();
    }
}
class Student {   
    String name;
    int age;                                       

    Student(String name, int age) {        
        this.name = name;                             
        this.age = age;
        System.out.println("Constructor has been called");
    }

    public void printinfo() {                           
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
