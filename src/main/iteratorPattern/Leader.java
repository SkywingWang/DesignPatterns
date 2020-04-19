package main.iteratorPattern;

/**
 * Created by skywingking
 * on 2020/4/19
 */
public abstract class Leader {
    protected Leader nextHandler; // 上一级领导处理者

    /**
     * 处理报账请求
     *
     * @param money 能批复的报账额度
     */
    public final void handleRequest(int money){
        if(money <= limit()){
            handle(money);
        }else {
            if(null != nextHandler)
                nextHandler.handleRequest(money);
        }
    }

    /**
     * 自身能批复的额度权限
     * @return
     */
    public abstract int limit();

    /**
     * 处理报账行为
     * @param money
     */
    public abstract void handle(int money);
}
