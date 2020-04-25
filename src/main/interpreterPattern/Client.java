package main.interpreterPattern;

/**
 * Created by skywingking
 * on 2020/4/25
 */
public class Client {
    public static void main(String[] args){
        Calculator c = new Calculator("153 + 2589 + 118 + 555");
        System.out.println(c.calculate());
    }
}
