package demo.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
public class LoginActivity extends Activity {//余松彦
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LinearLayout follow = (LinearLayout) findViewById(R.id.follow);//跳转到关注
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,FollowMain.class));
                finish();
                overridePendingTransition(0,0);
            }
        });
        LinearLayout my = (LinearLayout) findViewById(R.id.my);//跳转到我的
        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,OwnInfoSkip.class));
                finish();
                overridePendingTransition(0,0);
            }
        });
    }
    public void click1(View v){
        Intent i=new Intent(this,VideoActivity.class);
        startActivity(i);
    }
    public void click2(View v){
        Intent i=new Intent(this,GraphicActivity.class);
        startActivity(i);
    }

}