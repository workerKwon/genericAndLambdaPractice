package lambda.return_lambda;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface fi;

        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2,5));

        fi = (x, y) -> { return x + y; };
        System.out.println(fi.method(3,6));
    }
}
