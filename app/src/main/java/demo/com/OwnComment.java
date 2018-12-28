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

import demo.com.adapter.Adapter_Comment;
import demo.com.adapter.Entity_Comment;

public class OwnComment extends Activity {
    private List<Entity_Comment> entityCommentList =new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.owncomment_activity);
        RelativeLayout imgback =findViewById(R.id.imgback);
        initCollect();
        final Adapter_Comment adapter=new Adapter_Comment(OwnComment.this,R.layout.item_comment,entityCommentList);
        final ListView listview = (ListView) findViewById(R.id.commentlist);
        listview.setAdapter(adapter);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
//                startActivity(new Intent(OwnComment.this,OwnInfoSkip.class));
//                finish();
            }
        });
    }
    private void initCollect(){
        Entity_Comment one=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(one);
        Entity_Comment two=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(two);
        Entity_Comment three=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(three);
        Entity_Comment four=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(four);
        Entity_Comment five=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(five);
        Entity_Comment six=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(six);
        Entity_Comment seven=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(seven);
        Entity_Comment eigth=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(eigth);
        Entity_Comment nine=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(nine);
        Entity_Comment ten=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(ten);
        Entity_Comment tenone=new Entity_Comment("qwe","qwe","123",R.mipmap.pic);
        entityCommentList.add(tenone);
    }
}
