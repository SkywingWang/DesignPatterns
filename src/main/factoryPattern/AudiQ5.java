package main.factoryPattern;

/**
 * Created by skywingking
 * on 2020/3/31
 */
public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q5 启动");
    }

    @Override
    public void selfNavigatio() {
        System.out.println("Q5 开始自动巡航");
    }
}
