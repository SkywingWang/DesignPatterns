package main.statePattem;

/**
 * Created by skywingking
 * on 2020/4/10
 */
public interface TvState {
    public void nextChannel();
    public void prevChannel();
    public void turnUp();
    public void turnDown();
}
