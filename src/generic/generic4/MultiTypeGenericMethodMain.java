package generic.generic4;

public class MultiTypeGenericMethodMain {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>();
        p1.setKey(1);
        p1.setValue("test");

        Pair<Integer, String> p2 = new Pair<>();
        p2.setValue("test");
        p2.setKey(1);

        boolean trfa1 = MultitypeGenericMethod.compare(p1, p2);
        if(trfa1) {
            System.out.println("같은 키 밸류를 갖고 있다.");
        } else {
            System.out.println("다른 거 갖고 있다.");
        }

        Pair<String, String> p3 = new Pair<>();
        p3.setKey("user1");
        p3.setValue("test");

        Pair<String, String> p4 = new Pair<>();
        p4.setKey("user2");
        p4.setValue("test");

        boolean trfa2 = MultitypeGenericMethod.compare(p3, p4);
        if(trfa2) {
            System.out.println("같은 키 밸류를 갖고 있다.");
        } else {
            System.out.println("다른 거 갖고 있다.");
        }
    }
}
