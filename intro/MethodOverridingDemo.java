class Sup {
    public void who() {
        System.out.println("who() in Sup");
    }
}

class Sub1 extends Sup {
    public void who() {
        System.out.println("who() in Sub1");
    }
}

class Sub2 extends Sup {
    public void who() {
        System.out.println("who() in Sub2");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supref;

        supref = superOb;
        supref.who();

        supref = subOb1;
        supref.who();

        supref = subOb2;
        supref.who();
    }
}