package main.builderPattem;

/**
 * Created by skywingking
 * on 2020/3/29
 */
public class MacbookBuilder extends Builder{
    private Computer mComputer =new Macbook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
