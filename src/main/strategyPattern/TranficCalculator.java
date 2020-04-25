package main.strategyPattern;

/**
 * Created by skywingking
 * on 2020/4/4
 */
public class TranficCalculator {
    private static final int BUS = 1;
    private static final int SUBWAY = 2;

    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        calculator.setStrategy(new BusStrategy());
        System.out.println("公交车乘坐16公里的价格：" + calculator.calculatePrice(16));
    }

    CalculateStrategy mStrategy;
    public void setStrategy(CalculateStrategy mStrategy){
        this.mStrategy = mStrategy;
    }
    public int calculatePrice(int km){
        return mStrategy.calculatePrice(km);
    }
}
