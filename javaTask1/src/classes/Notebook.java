package classes;

import java.util.Arrays;

public class Notebook {
    private int id;
    private String model;
    private int price;
    private String[] params;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    public String[] getParams() {
        return this.params;
    }


    public Notebook() {
    }

    public Notebook(int id, String model, int price, String[] params) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.params = params;
    }


    public String toString() {
        return this.id + " " +
                this.model + " " +
                this.price + " " +
                Arrays.toString(this.params);
    }

}

