package generic.generic2;

public class MultiTypeExam {
    public void run() {
        MultiType<Tv, String> m1 = new MultiType<Tv, String>();
        m1.setKind(new Tv());
        m1.setModel("Smart Tv");

        Tv<Integer> tv = m1.getKind();
        String tvModel = m1.getModel();

        tv.setInch(58);
        int tvInch = tv.getInch();
        System.out.println(tvModel + "의 인치는 " + tvInch);

        MultiType<Car, String> m2 = new MultiType<Car, String>();
        m2.setKind(new Car());
        m2.setModel("k5");

        Car<Integer> car = m2.getKind();
        String carModel = m2.getModel();
        car.setMaxSpeed(300);

        int carMaxSpeed = car.getMaxSpeed();
        System.out.println(carModel + "의 최대 속력은 " + carMaxSpeed);
    }
}
