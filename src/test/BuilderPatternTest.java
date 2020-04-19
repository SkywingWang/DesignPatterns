package test;

import main.builderPattem.Builder;
import main.builderPattem.Director;
import main.builderPattem.MacbookBuilder;

/**
 * Created by skywingking
 * on 2020/3/29
 */
public class BuilderPatternTest {
    public static void main(String[] args){
        Builder builder = new MacbookBuilder();
        Director pcDirector = new Director(builder);
        pcDirector.construct("英特尔主板","Retina 显示器");
    }
}
