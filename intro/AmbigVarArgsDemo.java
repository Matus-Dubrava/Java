class AmbigVarArgs {
    public int sum(int... vals) {
        return 0;
    }

    public boolean sum(boolean... vals) {
        return true;
    }
}

public class AmbigVarArgsDemo {
    public static void main(String[] args) {
        AmbigVarArgs ava = new AmbigVarArgs();

        System.out.println(ava.sum(true, false));
        System.out.println(ava.sum(true, false));

        // ambiguous call to sum method
        System.out.println(ava.sum());
    }
}