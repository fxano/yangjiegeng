package demo.com.tool;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import demo.com.R;
import demo.com.login_fragment.Login_LandEmail;
public class LoginMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginmain_activity);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Login_LandEmail landing = new Login_LandEmail();
        transaction.add(R.id.loginFrag, landing);
        transaction.commit();
        getAndroiodScreenProperty();
    }
    public void getAndroiodScreenProperty(){
        WindowManager wm = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;// 屏幕宽度（像素）
        int height= dm.heightPixels; // 屏幕高度（像素）
        float density = dm.density;//屏幕密度（0.75 / 1.0 / 1.5）
        int densityDpi = dm.densityDpi;//屏幕密度dpi（120 / 160 / 240）
        //屏幕宽度算法:屏幕宽度（像素）/屏幕密度
        int screenWidth = (int) (width/density);//屏幕宽度(dp)
        int screenHeight = (int)(height/density);//屏幕高度(dp)
        Log.i("123", screenWidth + "======" + screenHeight);
    }
}