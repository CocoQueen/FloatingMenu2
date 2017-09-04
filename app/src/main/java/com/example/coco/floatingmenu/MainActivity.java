package com.example.coco.floatingmenu;

import android.os.Bundle;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;

import rjsv.floatingmenu.animation.enumerators.AnimationType;
import rjsv.floatingmenu.floatingmenubutton.FloatingMenuButton;

public class MainActivity extends AppCompatActivity {
    FloatingMenuButton fab_1;
    FloatingMenuButton fab_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
    }

    private void initUi() {
        fab_1 = (FloatingMenuButton) findViewById(R.id.fab_1);
        fab_2 = (FloatingMenuButton) findViewById(R.id.fab_2);
        fab_1.setStartAngle(0)
                .setEndAngle(360)
                .setRadius(200)
                .setAnimationType(AnimationType.EXPAND)
                .setAnchored(false);
        fab_1.getAnimationHandler()
                .setOpeningAnimationDuration(500)
                .setClosingAnimationDuration(200)
                .setLagBetweenItems(0)
                .setOpeningInterpolator(new FastOutSlowInInterpolator())
                .setClosingInterpolator(new FastOutLinearInInterpolator())
                .shouldFade(true)
                .shouldScale(true)
                .shouldRotate(false);


        fab_2.setStartAngle(0)//设置开始角度
                .setEndAngle(360)//设置结束角度
                .setRadius(200)//改变笑脸距圆心的距离
                .setAnimationType(AnimationType.RADIAL)//设置动画类型
                .setAnchored(false);//是否固定位置(可否拖动)
        fab_2.getAnimationHandler()
                .setOpeningAnimationDuration(500)//打开动画的时间
                .setClosingAnimationDuration(200)//关闭动画的时间
                .setLagBetweenItems(0)//设置拖动中心图标后笑脸延时多长时间跟随
                .setOpeningInterpolator(new FastOutSlowInInterpolator())
                .setClosingInterpolator(new FastOutLinearInInterpolator())
                .shouldFade(true)//逐渐消失
                .shouldScale(true)//
                .shouldRotate(false);//旋转/循环
    }
}
