class VarArgs {
    public void vaTest(int... v) {
        System.out.println("length: " + v.length);

        for (int arg : v) {
            System.out.print(arg + " ");
        }

        System.out.println();
    }
}

public class VarArgsDemo {
    public static void main(String[] args) {
        VarArgs vargs = new VarArgs();

        vargs.vaTest(1, 2, 3, 4);
    }
}