package demo.com.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import demo.com.R;
public class BrowseAdapter extends ArrayAdapter<Entity_Collect> {
    private  int resourceId;
    public int del=2;
    private  Context context;
    public BrowseAdapter(Context context, int textViewResourceId,List<Entity_Collect> objects) {
        super(context,textViewResourceId, objects);
        resourceId=textViewResourceId;
        this.context=context;
    }
    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        final Entity_Collect entityCollect =(Entity_Collect) getItem(position);
        View view;
        final ViewHolder viewHolder;
        if(convertView==null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.collectimg = (ImageView) view.findViewById(R.id.collectimg);
            viewHolder.collecttit = (TextView) view.findViewById(R.id.collecttit);
            viewHolder.collectdel =(ImageView)view.findViewById(R.id.collectdel);
            viewHolder.collectcov = (TextView) view.findViewById(R.id.collectcov);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        if (del%2==0){
            viewHolder.collecttit.setText(entityCollect.getCollecttit());
            viewHolder.collectcov.setText(entityCollect.getCollectcov());
            viewHolder.collectimg.setImageResource(entityCollect.getCollectimg());
        }else{
            viewHolder.collecttit.setText(entityCollect.getCollecttit());
            viewHolder.collectcov.setText(entityCollect.getCollectcov());
            viewHolder.collectimg.setImageResource(entityCollect.getCollectimg());
            viewHolder.collectdel.setVisibility(View.VISIBLE);
        }
        viewHolder.collectdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(getItem(position));
            }
        });
        return view;
    }
    class ViewHolder{
        ImageView collectimg;
        ImageView collectdel;
        TextView collecttit;
        TextView collectcov;
    }
}
