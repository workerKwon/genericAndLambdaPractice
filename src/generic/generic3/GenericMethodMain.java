package generic.generic3;

public class GenericMethodMain {
    public static void main(String[] args) {
        Box<Integer> box1 = GenericMethod.<Integer>boxing(100);
        // boxing 메소드는 Box 객체를 반환받는 메소드이다. 즉, box1은 Box 객체 참조 변수이다.
        int intValue = box1.getT();

        Box<String> box2 = GenericMethod.boxing("TEST");
        String strValue = box2.getT();

        System.out.println(intValue);
        System.out.println(strValue);
    }
}
