package lambda.method_refer;

import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println(operator.applyAsInt(1,2));

        operator = Calculator :: staticMethod;
        System.out.println(operator.applyAsInt(3,4));

        Calculator obj = new Calculator();
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println(operator.applyAsInt(4,5));

        operator = obj :: instanceMethod;
        System.out.println(operator.applyAsInt(6,7));
    }
}
