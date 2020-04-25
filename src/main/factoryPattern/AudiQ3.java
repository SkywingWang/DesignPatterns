package main.factoryPattern;

/**
 * Created by skywingking
 * on 2020/3/31
 */
public class AudiQ3 extends AudiCar {

    @Override
    public void drive() {
        System.out.println(" Q3 启动");
    }

    @Override
    public void selfNavigatio() {
        System.out.println(" Q3 开始自动巡航");
    }
}
