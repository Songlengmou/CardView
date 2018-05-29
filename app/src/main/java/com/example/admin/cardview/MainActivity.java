package com.example.admin.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

/**
 * CardView卡片布局的简单使用
 */
public class MainActivity extends AppCompatActivity {
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.cardView);

        cardView.setRadius(8);//设置图片圆角的半径大小
        cardView.setCardElevation(8);//设置阴影部分大小
        cardView.setContentPadding(5, 5, 5, 5);//设置图片距离阴影大小
    }
}
