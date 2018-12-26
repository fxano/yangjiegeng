package demo.com.adapter;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import demo.com.R;

public class Adapter_Article extends BaseAdapter {
    private List<Entity_Article> list;
    private Context context;
    public Adapter_Article(List list, Context context){
        this.list=list;
        this.context=context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder v=new ViewHolder();
        if(convertView==null){
            convertView = View.inflate(context, R.layout.item_article, null);
            v.name=convertView.findViewById(R.id.name);
            v.head=convertView.findViewById(R.id.head);
            v.time=convertView.findViewById(R.id.time);
            v.title=convertView.findViewById(R.id.title);
            v.content=convertView.findViewById(R.id.content);
            v.like=convertView.findViewById(R.id.like);
            v.comment=convertView.findViewById(R.id.comment);
            v.collection=convertView.findViewById(R.id.collection);
            v.like_num=convertView.findViewById(R.id.like_num);
            v.comment_num=convertView.findViewById(R.id.comment_num);
            v.collection_num=convertView.findViewById(R.id.collection_num);
            convertView.setTag(v);
        }else{
            v= (ViewHolder) convertView.getTag();
        }
        v.head.setImageResource(list.get(position).getHead());
        v.name.setText(list.get(position).getName());
        v.time.setText(list.get(position).getTime());
        v.title.setText(list.get(position).getTitle());
        v.content.setText(list.get(position).getContent());
        v.like_num.setText(list.get(position).getLike()+"");
        v.comment_num.setText(list.get(position).getComment()+"");
        v.collection_num.setText(list.get(position).getCollection()+"");


        return convertView;
    }
    class ViewHolder{
        ImageView head;
        TextView name;
        TextView time;
        TextView title;
        TextView content;
        LinearLayout like;
        LinearLayout comment;
        LinearLayout collection;
        TextView like_num;
        TextView comment_num;
        TextView collection_num;
    }
}
