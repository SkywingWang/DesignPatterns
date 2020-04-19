package main.prototypePattem;

import java.util.ArrayList;

/**
 * Created by skywingking
 * on 2020/3/29
 */
public class WordDocument implements Cloneable {
    private String mText;

    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument(){
        System.out.println("---------- WordDocument 构造函数 -----------");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            WordDocument doc = (WordDocument)super.clone();
            doc.mText = this.mText;
            doc.mImages = this.mImages;
            return doc;
        }catch (Exception e){

        }
        return null;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void setmImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    public void showDocument(){
        System.out.println("---------  word content start ----------");
        System.out.println("Text : " + mText );
        System.out.println("Images List : ");
        for(String imgName : mImages){
            System.out.println("image name : " + imgName);
        }
        System.out.println("---------  word content end ----------");
    }
}
