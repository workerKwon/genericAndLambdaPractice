package lambda.constructure_refer;

import java.awt.desktop.SystemSleepEvent;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Constructure> function1 = Constructure::new;
        Constructure constructure1 = function1.apply("1개 짜리 생성자 참조");
        System.out.println(constructure1.getId());

        BiFunction<String, String, Constructure> function2 = Constructure::new;
        Constructure constructure2 = function2.apply("2개 짜리", "생성자 참조");
        System.out.println(constructure2.getId());
    }
}
