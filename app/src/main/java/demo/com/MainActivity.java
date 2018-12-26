package demo.com;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import demo.com.adapter.ViewPageAdapter;
public class MainActivity extends FragmentActivity implements OnClickListener,OnPageChangeListener {
    private LinearLayout index,release,follow,my;
    private ImageView mainimg1,mainimg2,mainimg3,mainimg4;
    private TextView maintex1,maintex2,maintex3,maintex4;
    private ViewPager vp;
    private List<Fragment> mList;
    private ViewPageAdapter vpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mList = new ArrayList<Fragment>();
        mList.add(new LoginActivity());
        mList.add(new ReleaseMain());
        mList.add(new FollowMain());
        mList.add(new OwnInfoSkip());
        vpa = new ViewPageAdapter(getSupportFragmentManager(), mList);
        vp.setAdapter(vpa);
        vp.setCurrentItem(0);
        mainimg1.setImageResource(R.mipmap.index_this);
        maintex1.setTextColor(this.getResources().getColor(R.color.pink));
    }
    @SuppressWarnings("deprecation")
    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        index = findViewById(R.id.index);
        mainimg1=findViewById(R.id.mainimg1);
        maintex1=findViewById(R.id.maintex1);
        release =  findViewById(R.id.release);
        mainimg2=findViewById(R.id.mainimg2);
        maintex2=findViewById(R.id.maintex2);
        follow =  findViewById(R.id.follow);
        mainimg3=findViewById(R.id.mainimg3);
        maintex3=findViewById(R.id.maintex3);
        my = findViewById(R.id.my);
        mainimg4=findViewById(R.id.mainimg4);
        maintex4=findViewById(R.id.maintex4);
        index.setOnClickListener(this);
        release.setOnClickListener(this);
        follow.setOnClickListener(this);
        my.setOnClickListener(this);
        vp.setOnPageChangeListener(this);
    }
    @Override
    public void onPageScrollStateChanged(int arg0) {
        // TODO Auto-generated method stub
    }
    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
        // TODO Auto-generated method stub
    }
    @Override
    public void onPageSelected(int arg0) {
        switch (arg0) {
            case 0:
                mainimg1.setImageResource(R.mipmap.index_this);
                maintex1.setTextColor(this.getResources().getColor(R.color.pink));
                mainimg2.setImageResource(R.mipmap.release);
                maintex2.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg3.setImageResource(R.mipmap.follow);
                maintex3.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg4.setImageResource(R.mipmap.my);
                maintex4.setTextColor(this.getResources().getColor(R.color.gray));
                break;
            case 1:
                mainimg1.setImageResource(R.mipmap.index);
                maintex1.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg2.setImageResource(R.mipmap.release_this);
                maintex2.setTextColor(this.getResources().getColor(R.color.pink));
                mainimg3.setImageResource(R.mipmap.follow);
                maintex3.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg4.setImageResource(R.mipmap.my);
                maintex4.setTextColor(this.getResources().getColor(R.color.gray));
                break;
            case 2:
                mainimg1.setImageResource(R.mipmap.index);
                maintex1.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg2.setImageResource(R.mipmap.release);
                maintex2.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg3.setImageResource(R.mipmap.follow_this);
                maintex3.setTextColor(this.getResources().getColor(R.color.pink));
                mainimg4.setImageResource(R.mipmap.my);
                maintex4.setTextColor(this.getResources().getColor(R.color.gray));
                break;
            case 3:
                mainimg1.setImageResource(R.mipmap.index);
                maintex1.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg2.setImageResource(R.mipmap.release);
                maintex2.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg3.setImageResource(R.mipmap.follow);
                maintex3.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg4.setImageResource(R.mipmap.my_this);
                maintex4.setTextColor(this.getResources().getColor(R.color.pink));
                break;
            default:
                break;
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.index:
                vp.setCurrentItem(0);
                mainimg1.setImageResource(R.mipmap.index_this);
                maintex1.setTextColor(this.getResources().getColor(R.color.pink));
                mainimg2.setImageResource(R.mipmap.release);
                maintex2.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg3.setImageResource(R.mipmap.follow);
                maintex3.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg4.setImageResource(R.mipmap.my);
                maintex4.setTextColor(this.getResources().getColor(R.color.gray));
                break;
            case R.id.release:
                vp.setCurrentItem(1);
                mainimg1.setImageResource(R.mipmap.index);
                maintex1.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg2.setImageResource(R.mipmap.release_this);
                maintex2.setTextColor(this.getResources().getColor(R.color.pink));
                mainimg3.setImageResource(R.mipmap.follow);
                maintex3.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg4.setImageResource(R.mipmap.my);
                maintex4.setTextColor(this.getResources().getColor(R.color.gray));
                break;
            case R.id.follow:
                vp.setCurrentItem(2);
                mainimg1.setImageResource(R.mipmap.index);
                maintex1.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg2.setImageResource(R.mipmap.release);
                maintex2.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg3.setImageResource(R.mipmap.follow_this);
                maintex3.setTextColor(this.getResources().getColor(R.color.pink));
                mainimg4.setImageResource(R.mipmap.my);
                maintex4.setTextColor(this.getResources().getColor(R.color.gray));
                break;
            case R.id.my:
                vp.setCurrentItem(3);
                mainimg1.setImageResource(R.mipmap.index);
                maintex1.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg2.setImageResource(R.mipmap.release);
                maintex2.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg3.setImageResource(R.mipmap.follow);
                maintex3.setTextColor(this.getResources().getColor(R.color.gray));
                mainimg4.setImageResource(R.mipmap.my_this);
                maintex4.setTextColor(this.getResources().getColor(R.color.pink));
                break;
            default:
                break;
        }
    }
}
