package generic.generic3;

public class GenericMethod {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.setT(t);
        return box; // Box<T> 객체를 반환한다.
    }
}
