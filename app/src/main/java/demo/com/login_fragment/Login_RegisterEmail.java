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
public class Login_RegisterEmail extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_registeremail, null);
        Button next = view.findViewById(R.id.next);
        final EditText edit = view.findViewById(R.id.edit);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Login_RegisterEmailTwo landing = new Login_RegisterEmailTwo();
                transaction.add(R.id.loginFrag, landing);
                transaction.commit();
                transaction.remove(Login_RegisterEmail.this);

            }
        });
        TextView landing=view.findViewById(R.id.landing);
        landing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Login_LandEmail landing = new Login_LandEmail();
                transaction.add(R.id.loginFrag, landing);
                transaction.commit();
                transaction.remove(Login_RegisterEmail.this);
            }
        });
        return view;
    }
}
