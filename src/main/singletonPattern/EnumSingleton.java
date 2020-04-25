package main.singletonPattern;

/**
 * 枚举单例
 */
public enum  EnumSingleton {
    INSTANCE;
    public void doSomething(){
        System.out.println("do sth");
    }
}
