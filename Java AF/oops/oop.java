public class oop {

public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color = "blue";
    pen1.type = "ball";
    System.out.println( pen1.color);
    System.out.println( pen1.type);
    pen1.write();
    
    }
}
    class  Pen{
        String color;
        String type;
        public void write() {
            System.out.println("Writing with " + color + " " + type + " pen.");
        }
    }