class FindPerson {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: FindPerson <name>");
        } else {
            String name = args[0];
            String[][] numbers = { { "Tom", "222-3123" }, { "Mary", "894-1111" }, { "Jim", "472-1234" } };
            boolean found = false;

            for (String[] entry : numbers) {
                if (entry[0].equals(name)) {
                    System.out.println("phone number: " + entry[1]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Name not found");
            }
        }
    }
}