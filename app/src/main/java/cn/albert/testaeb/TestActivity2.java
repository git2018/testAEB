package cn.albert.testaeb;

import android.view.View;
import android.widget.Button;

import org.simple.eventbus.EventBus;
import org.simple.eventbus.Subscriber;

public class TestActivity2 extends BaseActivity {

//    @Subscriber
    @Subscriber(tag = "TestActivity2update")
//    @Subscriber(tag = "update",mode = ThreadMode.MAIN)
    void update(String aaa){
        Button button = findViewById(R.id.btn);
        button.setText(aaa);
    }

    public void onClick(View view) {
        EventBus.getDefault().post("testtesttesttesttesttesttesttesttesttest ","TestActivity1update");
    }
}
