package demo.com;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
public class OwnInfoSkip extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.owninfo_activity, null);
        RelativeLayout ownone =view.findViewById(R.id.ownone);
        RelativeLayout owntwo =view.findViewById(R.id.owntwo);
        RelativeLayout ownthree =view.findViewById(R.id.ownthree);
        RelativeLayout ownfour =view.findViewById(R.id.ownfour);
        ImageView setting =view.findViewById(R.id.setting);
        ownone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),OwnRelease.class));
            }
        });
        owntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),OwnCollection.class));
            }
        });
        ownthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),OwnComment.class));
            }
        });
        ownfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),OwnBrowse.class));
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {//跳转设置
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),SettingActivity.class));
            }
        });
        return view;
    }
}