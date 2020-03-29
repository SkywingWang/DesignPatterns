package main.singletonPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by skywingking
 * on 2020/3/25
 *
 * 容器单例
 */
public class ContainerSingletonManager {
    private static Map<String,Object> objMap = new HashMap<>();

    private ContainerSingletonManager(){}
    public static void registerService(String key,Object instance){
        if(!objMap.containsKey(key))
            objMap.put(key,instance);
    }

    public static Object getService(String key){
        return objMap.get(key);
    }
}
