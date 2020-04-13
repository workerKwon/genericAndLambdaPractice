package lambda.using_this;

public class Main {
    public static void main(String[] args) {
        UsingThis outter = new UsingThis();
        UsingThis.Inner inner = outter.new Inner();

        inner.method();
    }
}
