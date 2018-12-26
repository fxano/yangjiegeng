package demo.com;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

import demo.com.adapter.Entity_Collect;
import demo.com.adapter.Adapter_Collection;

public class OwnBrowse extends Activity {
    private List<Entity_Collect> browseList=new ArrayList<>();
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
        final Adapter_Collection adapter=new Adapter_Collection(OwnBrowse.this,R.layout.item_collect,browseList);
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
        Entity_Collect one=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(one);
        Entity_Collect two=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(two);
        Entity_Collect three=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(three);
        Entity_Collect four=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(four);
        Entity_Collect five=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(five);
        Entity_Collect six=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(six);
        Entity_Collect seven=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(seven);
        Entity_Collect eigth=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(eigth);
        Entity_Collect nine=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(nine);
        Entity_Collect ten=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(ten);
        Entity_Collect tenone=new Entity_Collect("呵呵呵","456",R.mipmap.pic);
        browseList.add(tenone);
    }
}
