package lambda.have_param_lambda;

public class Main {
    public static void main(String[] args){
        FunctionalInterface fi;

        fi = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(5);

        fi = (x) -> {System.out.println(x * 5);};
        fi.method(6);

        fi = x -> System.out.println(x * 5);
        fi.method(7);
    }
}
