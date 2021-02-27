public class start {

    public static void main(String[] args) {

//        Car car1 = new Car(
//                2,
//                "Lastochka",
//                new String[]{"opel", "astra"}
//        );

        String[] model = new String[2];
        model[0] = "Opel";
        model[1] = "Astra";
        Car car1 = new Car(1,
                "Lastochka",
                model);
        Engine engine = new Engine("dizel", 234);

        Car car2 = new Car(2, "Lastochka", model, engine);

        Car car3 = new Car(3, "bibika", model, "elektro", 234);

        System.out.println(car3);
    }

}
