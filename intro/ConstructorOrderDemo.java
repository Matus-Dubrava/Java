class A {
    public A() {
        System.out.println("Constructor A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Constructor B");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("Constructor C");
    }
}

public class ConstructorOrderDemo {
    public static void main(String[] args) {
        C c = new C();
    }
}