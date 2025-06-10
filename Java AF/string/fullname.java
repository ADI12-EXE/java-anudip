public class fullname {
    public static void main(String[] args) {
        String firstName = "Adi";
        String lastName = "bhaiya";
        String fullName = firstName + " " + lastName; 
        System.out.println("Full Name: " + fullName);
        System.out.println("Length of Full Name: " + fullName.length()); 
        System.out.println("Character at index 4: " + fullName.charAt(4)); 
        for (int i = 0 ; i < fullName.length(); i++) {
         System.out.println(fullName.charAt(i));
        }
    }
}
