package main.factoryPattem;

/**
 * Created by skywingking
 * on 2020/3/31
 */
public class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clz) {
        AudiCar car = null;
        try{
            car = (AudiCar) Class.forName(clz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) car;
    }
}
