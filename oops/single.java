public class single {
    
}

class shape {
    public void area() {
        System.out.println("Dispaly Area");
    }
}
class Trinagle extends shape {
    public void Calculate(int a , int b) {
        System.out.println("Area of Triangle is: " + (0.5 * a * b));

    }
}
class main1 {
    public static void main(String[] args) {
        Trinagle S1 = new Trinagle();
        S1.area();
        S1.Calculate(5, 10);
    }
}