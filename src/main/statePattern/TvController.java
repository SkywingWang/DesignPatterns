package main.statePattern;

/**
 * Created by skywingking
 * on 2020/4/10
 */
public class TvController implements PowerController {
    TvState mTvState;

    public void setTvState(TvState mTvState) {
        this.mTvState = mTvState;
    }

    public TvController() {
        super();
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机啦");

    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown(){
        mTvState.turnDown();
    }
}
