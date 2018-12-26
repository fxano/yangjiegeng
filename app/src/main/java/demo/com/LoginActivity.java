package demo.com;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import demo.com.adapter.Entity_IndexArticle;
import demo.com.adapter.IndexAdapter;
public class LoginActivity extends Fragment {
    List<Entity_IndexArticle> list;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_login, null);
        ListView lv = view.findViewById(R.id.lv);
        list = new ArrayList<>();
        initData();
        IndexAdapter ia = new IndexAdapter(list, getActivity());
        lv.setAdapter(ia);
        setListViewHeightBasedOnChildren(lv);
        return view;
    }
    private void initData() {
        for(int i=0;i<10;i++){
            Entity_IndexArticle indexArticle = new Entity_IndexArticle();
            indexArticle.setTitle1("日常眼妆教程，新手必备，容易学习。");
            indexArticle.setTitle2("如何刷出立体鼻梁");
            indexArticle.setImage1(R.mipmap.xinzi);
            indexArticle.setImage2(R.mipmap.xinzi);
            indexArticle.setHead1(R.mipmap.pic);
            indexArticle.setHead2(R.mipmap.pic);
            indexArticle.setName1("小余"+i);
            indexArticle.setName2("小曹"+i);
            indexArticle.setHeat1("10"+i);
            indexArticle.setHeat2("50"+i);
            list.add(indexArticle);
        }
    }
        public void setListViewHeightBasedOnChildren(ListView listView) {
            // 获取ListView对应的Adapter
            ListAdapter listAdapter = listView.getAdapter();
            if (listAdapter == null) {
                return;
            }
            int totalHeight = 0;
            for (int i = 0, len = listAdapter.getCount(); i < len; i++) {
                // listAdapter.getCount()返回数据项的数目
                View listItem = listAdapter.getView(i, null, listView);
                // 计算子项View 的宽高
                listItem.measure(0, 0);
                // 统计所有子项的总高度
                totalHeight += listItem.getMeasuredHeight();
            }
            ViewGroup.LayoutParams params = listView.getLayoutParams();
            params.height = totalHeight+ (listView.getDividerHeight() * (listAdapter.getCount() - 1));
            // listView.getDividerHeight()获取子项间分隔符占用的高度
            // params.height最后得到整个ListView完整显示需要的高度
            listView.setLayoutParams(params);
        }
    }