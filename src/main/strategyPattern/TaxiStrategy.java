package main.strategyPattern;

/**
 * Created by skywingking
 * on 2020/4/4
 */
public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
