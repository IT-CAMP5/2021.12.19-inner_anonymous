package pl.camp.it.inner;

public class Outer {
    private int a;

    public Outer() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void m() {

    }

    public static class Inner {
        private int b;

        public Inner() {
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public static class Inner2 {

        }
    }

    public enum InnerEnum {
        V1,
        V2
    }
}
