class XORCipher {
    public static void main(String[] args) {
        String msg = "Original message";
        String encrypted = "";
        String decrypted = "";
        int key = 88;

        for (int i = 0; i < msg.length(); i++) {
            encrypted += (char) (msg.charAt(i) ^ key);
        }

        for (int i = 0; i < encrypted.length(); i++) {
            decrypted += (char) (encrypted.charAt(i) ^ key);
        }

        System.out.println(msg);
        System.out.println(encrypted);
        System.out.println(decrypted);
    }
}