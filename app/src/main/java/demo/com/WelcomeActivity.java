package demo.com;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import demo.com.tool.LoginMainActivity;
public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        SystemClock.sleep(1000);
        startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
        finish();
    }
}