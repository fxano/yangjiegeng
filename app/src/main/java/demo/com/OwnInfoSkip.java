package demo.com;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
public class OwnInfoSkip extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.owninfo_activity);
        RelativeLayout ownone = (RelativeLayout) findViewById(R.id.ownone);
        RelativeLayout owntwo = (RelativeLayout) findViewById(R.id.owntwo);
        RelativeLayout ownthree = (RelativeLayout) findViewById(R.id.ownthree);
        RelativeLayout ownfour = (RelativeLayout) findViewById(R.id.ownfour);
        ImageView setting = (ImageView) findViewById(R.id.setting);
        ownone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnInfoSkip.this,OwnRelease.class));
            }
        });
        owntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnInfoSkip.this,OwnCollection.class));
            }
        });
        ownthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnInfoSkip.this,OwnComment.class));
            }
        });
        ownfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnInfoSkip.this,OwnBrowse.class));
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {//跳转设置
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnInfoSkip.this,SettingActivity.class));
            }
        });
        TextView myfollow = (TextView) findViewById(R.id.myfollow);
        TextView myfnas = (TextView) findViewById(R.id.myfans);
        myfollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnInfoSkip.this,MyFollow.class));
            }
        });
        myfnas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnInfoSkip.this,MyFans.class));
            }
        });
        LinearLayout follow = (LinearLayout) findViewById(R.id.follow);//跳转到关注
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnInfoSkip.this,FollowMain.class));
                finish();
            }
        });
        LinearLayout index = (LinearLayout) findViewById(R.id.index);//跳转到首页
        index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnInfoSkip.this,LoginActivity.class));
                finish();
            }
        });
    }
}