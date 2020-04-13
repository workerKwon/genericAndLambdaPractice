package generic.generic6;

public class ChildProduct<T, M, C> extends Product<T, M> {
    private C compamy;

    public void setCompamy(C company) {
        this.compamy = company;
    }

    public C getCompamy(){
        return compamy;
    }
}
