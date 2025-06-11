

public class parent {
    public void print(){
        System.out.println("This is Inheritance");
    }
}

class child extends parent {
    public void show() {
        System.out.println("This is Inheritance in child class");
        print();
    }

}
class main {

    public static void main(String[] args) {
        child C1 = new child();
        C1.show(); 
    }
 }