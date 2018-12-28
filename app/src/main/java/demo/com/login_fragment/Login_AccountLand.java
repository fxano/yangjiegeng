package demo.com.login_fragment;
import android.content.Intent;
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
import demo.com.MainActivity;
import demo.com.R;
public class Login_AccountLand extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_accountland, null);
        final EditText edit = view.findViewById(R.id.edit);
        Button next = view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),MainActivity.class));
            }
        });
        TextView landing=view.findViewById(R.id.emailland);
        landing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Login_LandEmail landing = new Login_LandEmail();
                transaction.add(R.id.loginFrag, landing);
                transaction.commit();
                transaction.remove(Login_AccountLand.this);
            }
        });
        TextView register = view.findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {//注册
            @Override
            public void onClick(View v) {
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Login_RegisterEmail landing = new Login_RegisterEmail();
                transaction.add(R.id.loginFrag, landing);
                transaction.commit();
                transaction.remove(Login_AccountLand.this);
            }
        });
        return view;
    }
}
