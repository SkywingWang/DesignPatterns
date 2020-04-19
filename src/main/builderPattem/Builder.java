package main.builderPattem;

/**
 * Created by skywingking
 * on 2020/3/28
 */
public abstract class Builder {
    public abstract void buildBoard(String board);

    public abstract void buildDisplay(String display);

    public abstract void buildOS();

    public abstract Computer create();
}
