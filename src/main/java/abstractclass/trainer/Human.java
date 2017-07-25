package abstractclass.trainer;

public abstract class Human {

    private static final int DEFAULT_FREE_TIME = 4;

    private String name;

    private int age;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void work();
}
