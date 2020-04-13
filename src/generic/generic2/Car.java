package generic.generic2;

public class Car<T> {
    private T maxSpeed;

    public void setMaxSpeed(T t) {
        this.maxSpeed = t;
    }

    public T getMaxSpeed() {
        return maxSpeed;
    }
}
