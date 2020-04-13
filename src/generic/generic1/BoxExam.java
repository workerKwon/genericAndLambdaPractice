package generic.generic1;

public class BoxExam {
    public void output() {
        Box<String> box1 = new Box<>();

        box1.setT("hello");

        String str = box1.getT();

        System.out.println(str);

        Box<Integer> box2 = new Box<>();

        box2.setT(10);

        int i = box2.getT();

        System.out.println(i);
    }
}
