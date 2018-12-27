package demo.com.adapter;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import demo.com.R;

public class Adapter_video_comment extends BaseAdapter {
    private List<Entity_video_comment> list;
    private Context context;
    public Adapter_video_comment(List<Entity_video_comment> list, Context context){
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
            convertView = View.inflate(context, R.layout.item_video_comment, null);
            v.head = convertView.findViewById(R.id.head);
            v.title = convertView.findViewById(R.id.title);
            v.content=convertView.findViewById(R.id.content);
            v.time=convertView.findViewById(R.id.time);
            convertView.setTag(v);
        }else{
            v= (ViewHolder) convertView.getTag();
        }
        v.head.setImageResource(list.get(position).getHead());
        v.title.setText(list.get(position).getTitle());
        v.content.setText(list.get(position).getContent());
        v.time.setText(list.get(position).getTime());
        return convertView;
    }
    class ViewHolder{
        ImageView head;
        TextView title;
        TextView content;
        TextView time;
    }
}
