package main.builderPattern;

/**
 * Created by skywingking
 * on 2020/3/28
 */
public class Macbook extends Computer {
    protected Macbook(){}

    @Override
    public void setOS() {
        mOS = "Mac OS X 10 .10";
    }
}
