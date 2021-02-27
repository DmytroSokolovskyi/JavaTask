import java.util.Arrays;

public class Car {
    private int id;
    private String name;
    private String[] model;
    private Engine engine;


    public void setId(int id) {
            this.id = id;
    }

    public int getId() {
            return this.id;
        }


    public void setName(String name) {
     this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setModel(String[] model) {
        this.model = model;
    }

    public String[] getModel() {
        return this.model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }



    public Car() {
    }

    public Car(int id, String name, String[] model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }
    
    public Car(int id, String name, String[] model, Engine engine) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.engine = engine;
    }

    public Car(int id, String name, String[] model, String type, int pover) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.engine = new Engine(type, pover) ;

    }


    public String toString() {
        return this.id +
                " " + this.name +
                " model" +
                Arrays.toString(this.model) +
                " engine: " + engine;
    }

}
