package p4;

import static p1.p2.B.*;

import p1.A;
import p1.p2.p3.C;
import p4.p5.E;


public class D {
    public int sum(){
        A a = new A();
        C c = new C();
        E e = new E();
return a.ia1 + c.ic3 + e.ie5 + ib2;
    }

    public static void main(String[] args) {
        System.out.println(new D().sum());
    }
}
