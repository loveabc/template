package com.imooc;

/**
 * Created by 0100060928 on 2017/6/9.
 * 设计模式之模板方法模式
 * 模拟奥运开幕式
 */
public abstract class OlympicTemplate {
    //奥运开幕式
    public void open(){
        //1、升国旗奏国歌
        raiseFlagAndSing();
        //2、领导人讲话
        speak();
        //3、文艺汇演
        dance();
        //4、运动员进场
        playerGo();
    }

    private void playerGo(){
        System.out.println("运动员进场");
    }

    protected abstract void dance();

    private void speak(){
        System.out.println("领导人讲话");
    }

    private void raiseFlagAndSing(){
        System.out.println("升国旗奏国歌");
    }
}
