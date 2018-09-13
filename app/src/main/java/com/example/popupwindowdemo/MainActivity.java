package com.example.popupwindowdemo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.haha);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View popupWindowView = getLayoutInflater().inflate(R.layout.item_popupwindow,null);
                final PopupWindow popupWindow = new PopupWindow(popupWindowView,200,200);
                Button btnReturn = popupWindowView.findViewById(R.id.btn_return);
                btnReturn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        popupWindow.dismiss();
                    }
                });
                popupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                popupWindow.setOutsideTouchable(false);
                popupWindow.setAnimationStyle(R.style.contextMenuAnim);
                popupWindow.setTouchable(true);
                popupWindow.showAsDropDown(view);
            }
        });

    }
}
