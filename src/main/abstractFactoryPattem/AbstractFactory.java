package main.abstractFactoryPattem;

/**
 * Created by skywingking
 * on 2020/4/3
 */
public abstract class AbstractFactory {
    /**
     * 创建产品A的方法
     *
     * @return 产品A对象
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品B的方法
     *
     * @return 产品B对象
     */
    public abstract AbstractProductB createProductB();
}
