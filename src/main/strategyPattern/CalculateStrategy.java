package main.strategyPattern;

/**
 * Created by skywingking
 * on 2020/4/4
 */
public interface CalculateStrategy {
    /**
     * 按公里来计算价格
     * @param km
     * @return
     */
    int calculatePrice(int km);
}
