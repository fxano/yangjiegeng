package demo.com;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
public class FollowMain extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.follow_activity);
        LinearLayout my = (LinearLayout) findViewById(R.id.my);//跳转我的
        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FollowMain.this,OwnInfoSkip.class));
                finish();
//                overridePendingTransition(0,0);
            }
        });
        LinearLayout index = (LinearLayout) findViewById(R.id.index);//跳转到首页
        index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FollowMain.this,LoginActivity.class));
                finish();
//                overridePendingTransition(0,0);
            }
        });
    }
}
