package demo.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import demo.com.adapter.Adapter_video_comment;
import demo.com.adapter.Entity_video_comment;

public class VideoActivity extends AppCompatActivity {
    List<Entity_video_comment> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        list=new ArrayList<>();
        initData();
        ListView lv = findViewById(R.id.lv_comments);
        lv.setAdapter(new Adapter_video_comment(list,this));
    }

    private void initData() {
        for(int i=0;i<10;i++){
            Entity_video_comment e = new Entity_video_comment();
            e.setHead(R.mipmap.pic);
            e.setTitle("我是个流氓"+i);
            e.setContent("用户就是父母"+i);
            e.setLike(R.mipmap.like);
            e.setTime("06:1"+i);
            list.add(e);
        }
    }

    public void backclick(View v){
        Intent i=new Intent(this,IndexActivity.class);
        startActivity(i);
    }
}
