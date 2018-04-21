public class TestPolymorphism {

    public static void main(String[] args) {
        A a = new B();//upcasting



        a.show();
        System.out.println(a.i);

        B b = (B) a; //downcasting

    }
}

class A {

    int i, j;

    A() {

        System.out.println("In A's constructor");
    }

    void show() {
        System.out.println("The value a and b:" + (i + j));
    }
}

class B extends A {

    int k;

    B() {

        System.out.println("In B's constructor");
    }

    void show() {
        System.out.println("In B value a and b:" + (i + j + k));
    }
}

