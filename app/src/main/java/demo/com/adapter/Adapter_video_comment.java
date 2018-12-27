package demo.com.adapter;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
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
            View v = View.inflate(context, R.layout.item_video_comment, null);
            ImageView head = v.findViewById(R.id.head);
            TextView title = v.findViewById(R.id.title);
            TextView content=v.findViewById(R.id.content);
            TextView time=v.findViewById(R.id.time);
            ImageView like=v.findViewById(R.id.like_state);
            head.setImageResource(list.get(position).getHead());
            title.setText(list.get(position).getTitle());
            content.setText(list.get(position).getContent());
            time.setText(list.get(position).getTime());
            like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundResource(R.mipmap.like_this);
                AnimationSet as=new AnimationSet(true);
                RotateAnimation ra=new RotateAnimation(0, -30, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                ra.setDuration(500);
                ra.setRepeatCount(1);
                ra.setRepeatMode(Animation.REVERSE);
                ScaleAnimation sa=new ScaleAnimation(1.0f, 1.3f, 1.0f, 1.3f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                sa.setDuration(500);
                sa.setRepeatCount(1);
                sa.setRepeatMode(Animation.REVERSE);
                as.addAnimation(ra);
                as.addAnimation(sa);
                v.setAnimation(as);

            }
        });
        return v;
    }
    class ViewHolder{
        ImageView head;
        TextView title;
        TextView content;
        TextView time;
        ImageView like;
    }
}
