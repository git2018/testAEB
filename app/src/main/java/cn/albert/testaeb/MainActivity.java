package cn.albert.testaeb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.simple.eventbus.Subscriber;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Subscriber
    @Subscriber(tag = "MainActivityupdate")
//    @Subscriber(tag = "update",mode = ThreadMode.MAIN)
    void update(String aaa){
        Button button = findViewById(R.id.btn);
        button.setText(aaa);
    }

    public void onClick(View view) {
        startActivity(new Intent(this,TestActivity1.class));
    }
}
