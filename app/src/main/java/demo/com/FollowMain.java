package demo.com;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import demo.com.adapter.Adapter_Article;
import demo.com.adapter.Entity_Article;
public class FollowMain extends Fragment {
    List<Entity_Article> list;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.follow_activity, null);
        list = new ArrayList<>();
        ListView lv = view.findViewById(R.id.list_article);
        initData();
        Adapter_Article ap = new Adapter_Article(list,getContext());
        lv.setAdapter(ap);
        return view;
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
