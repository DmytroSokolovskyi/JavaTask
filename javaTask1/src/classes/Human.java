package classes;

import java.util.Arrays;

public class Human {
    private int age;
    private String name;
    private boolean status;
    private String[] info;


    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getName(){
        return this.age;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus() {
        return this.status;
    }

    public void setInfo(String[] info) {
        this.info = info;
    }
    public String[] getInfo() {
        return this.info;
    }

    public Human() {
    }

    public Human(int age, String name, boolean status, String[] info) {
        this.age = age;
        this.name = name;
        this.status = status;
        this.info = info;
    }


public String toString() {
    return this.age + " " +
            this.name + " " +
            this.status + " " +
            Arrays.toString(this.info);
}
}
