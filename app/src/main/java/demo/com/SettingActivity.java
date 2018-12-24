package demo.com;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
public class SettingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        RelativeLayout imgback =findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        RelativeLayout One=findViewById(R.id.settingOne);
        RelativeLayout Two=findViewById(R.id.settingTwo);
        RelativeLayout Three=findViewById(R.id.settingThree);
        One.setOnClickListener(new View.OnClickListener() {//跳转到账号安全
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingActivity.this,SettingSafety.class));
            }
        });
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingActivity.this,SettingHelp.class));
            }
        });
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingActivity.this,SettingAbout.class));
            }
        });
    }
}