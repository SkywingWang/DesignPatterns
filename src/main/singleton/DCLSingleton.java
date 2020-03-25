package main.singleton;

public class DCLSingleton {
    private static DCLSingleton sInstance = null;
    private DCLSingleton(){}
    public void doSomething(){
        System.out.println("do sth");
    }
    public static synchronized DCLSingleton getInstance(){
        if(sInstance == null){
            synchronized(DCLSingleton.class){
                if(sInstance == null){
                    sInstance = new DCLSingleton();
                }
            }
        }
        return sInstance;
    }
}
