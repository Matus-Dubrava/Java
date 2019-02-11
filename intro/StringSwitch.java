class StringSwith {
    public static void main(String[] args) {
        String command = "cancel";

        switch (command) {
        case "connect":
            System.out.println("connecting...");
            break;
        case "cancel":
            System.out.println("cancelling....");
            break;
        case "disconnect":
            System.out.println("disconnecting...");
            break;
        default:
            System.out.println("Unknown operation...");
            break;
        }
    }
}