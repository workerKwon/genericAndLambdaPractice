package lambda.no_param_lambda;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {System.out.println("method call2");};
        fi.method();

        fi = () -> System.out.println("method call3");
        fi.method();
    }
}
