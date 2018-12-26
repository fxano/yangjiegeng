package demo.com.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import demo.com.R;

public class IndexAdapter extends BaseAdapter {
    private List<Entity_IndexArticle> list;
    private Context context;
    public IndexAdapter(List list, Context context){
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
            convertView = View.inflate(context, R.layout.item_index_twoarticle, null);
            v.image1 = convertView.findViewById(R.id.image1);
            v.image2 = convertView.findViewById(R.id.image2);
            v.title1=convertView.findViewById(R.id.title1);
            v.title2=convertView.findViewById(R.id.title2);
            v.name1=convertView.findViewById(R.id.name1);
            v.name2=convertView.findViewById(R.id.name2);
            v.heat1=convertView.findViewById(R.id.heat1);
            v.heat2=convertView.findViewById(R.id.heat2);
            v.head1=convertView.findViewById(R.id.head1);
            v.head2=convertView.findViewById(R.id.head2);
            convertView.setTag(v);
        }else{
            v= (ViewHolder) convertView.getTag();
        }
        v.image1.setImageResource(list.get(position).getImage1());
        v.image2.setImageResource(list.get(position).getImage2());
        v.title1.setText(list.get(position).getTitle1());
        v.title2.setText(list.get(position).getTitle2());
        v.name1.setText(list.get(position).getName1());
        v.name2.setText(list.get(position).getName2());
        v.heat1.setText(list.get(position).getHeat1());
        v.heat2.setText(list.get(position).getHeat2());
        v.head1.setImageResource(list.get(position).getHead1());
        v.head2.setImageResource(list.get(position).getHead2());
        return convertView;
    }
    class ViewHolder{
        ImageView image1;
        ImageView image2;
        TextView title1;
        TextView title2;
        TextView name1;
        TextView name2;
        TextView heat1;
        TextView heat2;
        ImageView head1;
        ImageView head2;
    }
}
