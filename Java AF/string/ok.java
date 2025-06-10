public class ok {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;

            char frontchar = sb.charAt(front);
            char backcahr = sb.charAt(back);
    
    }
    System.out.println (sb);
    
    }
}
