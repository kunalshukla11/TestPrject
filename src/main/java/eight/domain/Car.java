package eight.domain;

public class Car {
    private String name;
    private int model;

    public Car(String name, int model){
        this.model=model;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
