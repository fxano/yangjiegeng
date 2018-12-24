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

import demo.com.adapter.Collect;
import demo.com.adapter.CollectionAdapter;

public class OwnBrowse extends Activity {
    private List<Collect> browseList=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browse_activity);
        RelativeLayout imgback =findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        initCollect();
        final CollectionAdapter adapter=new CollectionAdapter(OwnBrowse.this,R.layout.collect_item,browseList);
        final ListView listview = (ListView) findViewById(R.id.browseList);
        listview.setAdapter(adapter);
        RelativeLayout delbuttom =findViewById(R.id.delbuttom);
        delbuttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.del++;
                listview.setAdapter(adapter);
            }
        });
    }
    private void initCollect(){
        Collect one=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(one);
        Collect two=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(two);
        Collect three=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(three);
        Collect four=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(four);
        Collect five=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(five);
        Collect six=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(six);
        Collect seven=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(seven);
        Collect eigth=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(eigth);
        Collect nine=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(nine);
        Collect ten=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(ten);
        Collect tenone=new Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(tenone);
    }
}
