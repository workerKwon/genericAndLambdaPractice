package generic.generic5;

public class ExtendsGenericMove {
    public void run() {
        int val1 = ExtendsGeneric.compare(10, 20);
        System.out.println(val1);

        int val2 = ExtendsGeneric.compare(20, 20);
        System.out.println(val2);

        int val3 = ExtendsGeneric.compare(30.33, 20);
        System.out.println(val3);
    }
}
