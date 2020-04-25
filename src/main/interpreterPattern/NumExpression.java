package main.interpreterPattern;

/**
 * Created by skywingking
 * on 2020/4/25
 */
public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int num){
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
