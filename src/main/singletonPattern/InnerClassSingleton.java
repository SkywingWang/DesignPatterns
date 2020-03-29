package main.singletonPattern;

/**
 * 内部类单例
 */
public class InnerClassSingleton {
    private InnerClassSingleton(){}
    public static InnerClassSingleton getInstance(){
        return InnerClassSingletonHolder.sInstance;
    }
    private static class InnerClassSingletonHolder{
        private static final InnerClassSingleton sInstance = new InnerClassSingleton();
    }
}
