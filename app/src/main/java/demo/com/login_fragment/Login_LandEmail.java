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
        final EditText edit = view.findViewById(R.id.edit);//输入框
        Button next = view.findViewById(R.id.next);//下一步按钮
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//下一步
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Login_LandEmailThree landing = new Login_LandEmailThree();
                transaction.add(R.id.loginFrag, landing);
                transaction.commit();
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
                transaction.remove(Login_LandEmail.this);
            }
        });
        TextView account=view.findViewById(R.id.accountland);//账号密码登陆
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Login_AccountLand landing = new Login_AccountLand();
                transaction.add(R.id.loginFrag, landing);
                transaction.commit();
                transaction.remove(Login_LandEmail.this);
            }
        });
        return view;
    }
}
