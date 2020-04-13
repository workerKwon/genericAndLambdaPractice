package generic.generic6;

public class Main {
    public static void main(String[] args){
        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("Smart Tv");
        product.setCompamy("Samsung");

        Tv tvDes = product.getKind();
        tvDes.setDescription("삼성 스마트 티브이 설명서");

        Storage<Tv> storage = new StorageImpl<Tv>(100);
        storage.add(new Tv(), 5);
        Tv tv = storage.get(5);
        tv.setDescription("다섯번째 티브이의 설명서");

        System.out.println(tv.getDescription());
    }
}
