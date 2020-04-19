package main.factoryPattem;

/**
 * Created by skywingking
 * on 2020/3/31
 */
public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
