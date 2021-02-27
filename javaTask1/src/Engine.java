public class Engine {
    private String type;
    private int power;


    public Engine() {
    }

   public Engine(String type, int power) {
        this.type = type;
       this.power = power;
   }

   public void setType (String type) {
        this.type = type;
   }

   public String getType () {
       return type;
   }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

public String toString() {
    return this.type + " " + this.power;
}
}

