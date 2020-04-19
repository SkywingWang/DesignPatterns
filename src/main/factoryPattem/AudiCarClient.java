package main.factoryPattem;

/**
 * Created by skywingking
 * on 2020/3/31
 */
public class AudiCarClient {
    public static void main(String[] args) {
        AudiFactory factory = new AudiCarFactory();

        AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selfNavigatio();

        AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selfNavigatio();
    }
}
