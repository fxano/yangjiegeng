package demo.com;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import demo.com.adapter.ArticleAdapter;
import demo.com.adapter.Entity_Article;

public class FollowMain extends Activity{
    List<Entity_Article> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.follow_activity);
        LinearLayout my = (LinearLayout) findViewById(R.id.my);//跳转我的

        list = new ArrayList<>();
        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FollowMain.this,OwnInfoSkip.class));
                finish();
            }
        });
        LinearLayout index = (LinearLayout) findViewById(R.id.index);//跳转到首页
        index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FollowMain.this,LoginActivity.class));
                finish();
            }
        });
        ListView lv = findViewById(R.id.list_article);
        initData();
        ArticleAdapter ap = new ArticleAdapter(list,this);
        lv.setAdapter(ap);
    }
    private int head;
    private String name;
    private String time;
    private String title;
    private String content;
    private int like;
    private int comment;
    private int collection;

    private void initData() {
        for(int i=0;i<10;i++){
            Entity_Article a = new Entity_Article();
            a.setHead(R.mipmap.pic);
            a.setName("小曹"+i);
            a.setTime("06:0"+i);
            a.setTitle("如何画好看又清新的眼妆?"+i);
            a.setContent("夏天到了，一个清爽的妆容为女孩子加分不少尤其是眼妆");
            a.setLike(10+i);
            a.setComment(20+i);
            a.setCollection(30+i);
            list.add(a);
        }
    }
}
