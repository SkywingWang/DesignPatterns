package main.interpreterPattern;

/**
 * Created by skywingking
 * on 2020/4/25
 */
public abstract class ArithmeticExpression {
    /**
     * 抽象的解析方法
     * 具体的解析逻辑由具体的子类实现
     *
     * @return
     */
    public abstract int interpret();
}
