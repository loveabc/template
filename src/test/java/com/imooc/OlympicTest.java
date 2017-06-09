package com.imooc;

/**
 * Created by 0100060928 on 2017/6/9.
 */
public class OlympicTest {
    public static void main(String[] args){
        //北京奥运会开幕
        OlympicTemplate templateofBeijing=new BeijingOlympic();
        templateofBeijing.open();
        OlympicTemplate templateofLondon=new LondonOlympic();
        templateofLondon.open();
    }
}
