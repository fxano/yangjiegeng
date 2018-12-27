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
    ImageView like;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
            View v1 = View.inflate(context, R.layout.item_video_comment, null);
            ImageView head = v1.findViewById(R.id.head);
            TextView title = v1.findViewById(R.id.title);
            TextView content=v1.findViewById(R.id.content);
            TextView time=v1.findViewById(R.id.time);
            like=v1.findViewById(R.id.like_state);
            if(list.get(position).isLike()){
                like.setImageResource(R.mipmap.like_this);
            }else if(!list.get(position).isLike()){
                like.setImageResource(R.mipmap.like);
            }
            head.setImageResource(list.get(position).getHead());
            title.setText(list.get(position).getTitle());
            content.setText(list.get(position).getContent());
            time.setText(list.get(position).getTime());
            like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView v2= (ImageView) v;
                if(list.get(position).isLike()){
                    list.get(position).setLike(false);
                    v2.setImageResource(R.mipmap.like);
                }else if(!list.get(position).isLike()){
                    list.get(position).setLike(true);
                    v2.setImageResource(R.mipmap.like_this);
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
                    v2.startAnimation(as);

                }


            }
        });
        return v1;
    }

}
