package classes;

import java.util.Arrays;

public class House {
    private int nomber;
    private String streat;
    private int height;
    private String[] params;


public void setNomber(int nomber) {
    this.nomber = nomber;
}
public int getNomber() {
    return this.nomber;
}

public void setStreet(String streat) {
    this.streat = streat;
}
public String getStreat() {
    return this.streat;
}

public void setHeight(int height) {
    this.height = height;
}
public int getHeight() {
    return this.height;
}

public void setParams(String[] params) {
    this.params = params;
}

public String[] getParams() {
    return this.params;
    }

    public House() {
    }
    public House(int nomber, String streat, int height, String[] params ) {
        this.nomber = nomber;
        this.streat = streat;
        this.height = height;
        this.params = params;
    }

    public String toString() {
        return this.nomber + " " +
                this.streat + " " +
                this.height + " " +
                Arrays.toString(this.params);
    }

}
