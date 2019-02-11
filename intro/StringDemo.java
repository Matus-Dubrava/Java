class StringDemo {
    public static void main(String[] args) {
        String str1 = "When it comes to programming, Java is #1";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful";

        System.out.println("length of str1 is: " + str1.length());

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(" " + str1.charAt(i));
        }
        System.out.println();

        System.out.println("str1 and str2 equals? " + str1.equals(str2));
        System.out.println("str2 and str3 equals? " + str2.equals(str3));

        int result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("str1 and str3 are equal");
        } else if (result < 0) {
            System.out.println("str1 is less than str3");
        } else {
            System.out.println("str1 is more than str3");
        }

        System.out.println("index if [are] in str3 is: " + str3.indexOf("are"));
    }
}