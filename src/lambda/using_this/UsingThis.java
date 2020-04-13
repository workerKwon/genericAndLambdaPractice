package lambda.using_this;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            FunctionalInterface fi = () -> {
                System.out.println(outterField);
                System.out.println(UsingThis.this.outterField); // 바깥 객체의 참조를 얻기 위해서는 클래스명.this 를 사용해야한다.

                System.out.println(innerField);
                System.out.println(this.innerField);
            };
            fi.method();
        }
    }
}
