package generic.generic2;

public class MultiType<T, M> {
    private T kind;
    private M model;

    public T getKind() {
        return kind;
    }
    public M getModel() {
        return model;
    }

    public void setKind(T t) {
        this.kind = t;
    }
    public void setModel(M m) {
        this.model = m;
    }
}
