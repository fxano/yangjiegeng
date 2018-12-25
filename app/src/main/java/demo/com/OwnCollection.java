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
import demo.com.adapter.CollectionAdapter;
public class OwnCollection extends Activity {
    private List<Entity_Collect> entityCollectList =new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collection_activity);
        RelativeLayout imgback =findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
                   public void onClick(View v) {
                onBackPressed();
            }
        });
        initCollect();
        final CollectionAdapter adapter=new CollectionAdapter(OwnCollection.this,R.layout.item_collect, entityCollectList);
        final ListView listview = (ListView) findViewById(R.id.collectionList);
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
        Entity_Collect one=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(one);
        Entity_Collect two=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(two);
        Entity_Collect three=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(three);
        Entity_Collect four=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(four);
        Entity_Collect five=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(five);
        Entity_Collect six=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(six);
        Entity_Collect seven=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(seven);
        Entity_Collect eigth=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(eigth);
        Entity_Collect nine=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(nine);
        Entity_Collect ten=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(ten);
        Entity_Collect tenone=new Entity_Collect("哈哈哈","123",R.mipmap.pic);
        entityCollectList.add(tenone);
    }
}