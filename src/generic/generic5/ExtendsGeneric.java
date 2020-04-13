package generic.generic5;

public class ExtendsGeneric {
    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2); // v1이 작으면 -1, 같으면 0, 크면 1 을 반환하는 메소드;
    }
}
