package demo.com.login_fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import demo.com.R;
public class Login_LandEmail extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_landemail, null);
        Button next = view.findViewById(R.id.next);
        final EditText edit = view.findViewById(R.id.edit);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Login_LandEmailTwo landing = new Login_LandEmailTwo();
                transaction.add(R.id.loginFrag, landing);
                transaction.commit();
            }
        });

        return view;
    }
}
