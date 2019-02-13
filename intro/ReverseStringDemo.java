class ReverseString {
    static String reverse(String s) {
        if (s.length() == 1) {
            return s;
        } else {
            return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
    }
}

public class ReverseStringDemo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: ReverseStringDemo <word>");
            return;
        }

        System.out.println("Original: " + args[0]);
        System.out.println("Reversed: " + ReverseString.reverse(args[0]));
    }
}