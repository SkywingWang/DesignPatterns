package test;

import main.builderPattern.Builder;
import main.builderPattern.Director;
import main.builderPattern.MacbookBuilder;

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
