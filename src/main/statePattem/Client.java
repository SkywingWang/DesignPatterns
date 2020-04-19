package main.statePattem;

/**
 * Created by skywingking
 * on 2020/4/10
 */
public class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();

        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnUp();
        tvController.powerOff();
        tvController.turnUp();
    }
}
