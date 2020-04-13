package lambda.using_local_var;

public class UsingLocalVar {
    void method(int arg){
        int localVar = 40;

        FunctionalInterface fi = () -> {
            System.out.println(arg);
            System.out.println(localVar);
        };
        fi.method();
    }
}
