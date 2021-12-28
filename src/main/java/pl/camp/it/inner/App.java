package pl.camp.it.inner;

public class App {
    public static void main(String[] args) {
        //Outer outer = new Outer();

        //Outer.Inner inner = new Outer().new Inner();

        Outer.m();

        Outer.Inner inner = new Outer.Inner();
        inner.setB(4);

        Outer.InnerEnum innerEnum = Outer.InnerEnum.V1;

        Outer.Inner.Inner2 inner2 = new Outer.Inner.Inner2();
    }
}
