package cn.albert.testaeb;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import org.simple.eventbus.Subscriber;

public class TestActivity1 extends BaseActivity {



//    @Subscriber
    @Subscriber(tag = "TestActivity1update")
//    @Subscriber(tag = "update",mode = ThreadMode.MAIN)
    void update(String aaa){
        Button button = findViewById(R.id.btn);
        button.setText(aaa);
    }

    public void onClick(View view) {
        startActivity(new Intent(this,TestActivity2.class));
    }
}
