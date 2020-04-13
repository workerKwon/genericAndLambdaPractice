package generic.generic2;

public class Tv<T> {
    private T inch;

    public void setInch(T t) {
        this.inch = t;
    }
    public T getInch() {
        return inch;
    }
}
