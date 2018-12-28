package demo.com.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import demo.com.R;
import demo.com.VideoActivity;

public class Adapter_MyRelease extends BaseAdapter {
    private List<Entity_MyRelease> list;
    private Context context;
    public Adapter_MyRelease(List list, Context context){
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
            convertView = View.inflate(context, R.layout.item_release, null);
            v.head = convertView.findViewById(R.id.head);
            v.name=convertView.findViewById(R.id.name);
            v.time=convertView.findViewById(R.id.time);
            v.title=convertView.findViewById(R.id.title);

            convertView.setTag(v);
        }else{
            v= (ViewHolder) convertView.getTag();
        }
        v.head.setImageResource(list.get(position).getHead());
        v.name.setText(list.get(position).getName());
        v.time.setText(list.get(position).getTime());
        v.title.setText(list.get(position).getTitle());
        return convertView;
    }
    class ViewHolder{
        ImageView head;
        TextView name;
        TextView time;
        TextView title;
    }

}
