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

public class Adapter_Comment extends ArrayAdapter {
    private  int resourceId;
    private Context context;
    public Adapter_Comment(Context context, int textViewResourceId, List<Entity_Comment> objects) {
        super(context,textViewResourceId, objects);
        resourceId=textViewResourceId;
        this.context=context;
    }
    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        final Entity_Comment entitycomment =(Entity_Comment) getItem(position);
        View view;
        final  ViewHolder viewHolder;
        if(convertView==null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.commentimg = (ImageView) view.findViewById(R.id.commentimg);
            viewHolder.commenttit = (TextView) view.findViewById(R.id.commenttit);
            viewHolder.commentdel =(ImageView)view.findViewById(R.id.commentdel);
            viewHolder.commentcov = (TextView) view.findViewById(R.id.commentcov);
            viewHolder.commentcov2 = (TextView) view.findViewById(R.id.commentcov2);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.commenttit.setText(entitycomment.getcommenttit());
        viewHolder.commentcov.setText(entitycomment.getcommentcov());
        viewHolder.commentcov2.setText(entitycomment.getcommentcov2());
        viewHolder.commentimg.setImageResource(entitycomment.getcommentimg());
        
        return view;
    }
    class ViewHolder{
        ImageView commentimg;
        ImageView commentdel;
        TextView commenttit;
        TextView commentcov;
        TextView commentcov2;
    }
}

