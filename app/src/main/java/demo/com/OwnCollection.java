package demo.com;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.List;
import demo.com.adapter.Collect;
import demo.com.adapter.CollectionAdapter;
public class OwnCollection extends Activity {
    private List<Collect> collectList=new ArrayList<>();
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
        final CollectionAdapter adapter=new CollectionAdapter(OwnCollection.this,R.layout.collect_item,collectList);
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
        Collect one=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(one);
        Collect two=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(two);
        Collect three=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(three);
        Collect four=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(four);
        Collect five=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(five);
        Collect six=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(six);
        Collect seven=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(seven);
        Collect eigth=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(eigth);
        Collect nine=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(nine);
        Collect ten=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(ten);
        Collect tenone=new Collect("哈哈哈","123",R.mipmap.pic);
        collectList.add(tenone);
    }
}