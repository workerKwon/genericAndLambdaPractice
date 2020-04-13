package lambda.constructure_refer;

public class Constructure {
    private String name;
    private String id;

    public Constructure(){
        System.out.println("실행");
    }

    public Constructure(String id) {
        System.out.println("id 실행");
        this.id = id;
    }

    public Constructure(String id, String name) {
        System.out.println("name, id 실행");
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
