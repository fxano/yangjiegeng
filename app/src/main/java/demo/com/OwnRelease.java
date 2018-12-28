package demo.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

import demo.com.adapter.Adapter_MyRelease;
import demo.com.adapter.Entity_MyRelease;

public class OwnRelease extends Activity {
    private List<Entity_MyRelease> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ownrelease);
        RelativeLayout imgback =findViewById(R.id.imgback);
        list=new ArrayList<>();
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
//                startActivity(new Intent(OwnRelease.this,OwnInfoSkip.class));
//                finish();
            }
        });
        initData();
        ListView lv = findViewById(R.id.lv);
        lv.setAdapter(new Adapter_MyRelease(list,this));
    }

    private void initData() {
        for(int i=0;i<10;i++){
            Entity_MyRelease em = new Entity_MyRelease();
            em.setHead(R.mipmap.pic);
            em.setName("小余"+i);
            em.setTime("06:1"+i);
            em.setTitle("妆出你想要的样子！"+i);
            list.add(em);
        }
    }
}
