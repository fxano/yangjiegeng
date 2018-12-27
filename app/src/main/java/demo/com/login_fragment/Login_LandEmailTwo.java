package demo.com.login_fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import demo.com.R;
public class Login_LandEmailTwo extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Login_LandEmail one=new Login_LandEmail();
        View view = inflater.inflate(R.layout.login_landemailtwo, null);
        TextView textView=view.findViewById(R.id.emailtext);
//        textView.setText();
        return view;
    }
}
