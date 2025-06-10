public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        sb.delete(3, 8);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
