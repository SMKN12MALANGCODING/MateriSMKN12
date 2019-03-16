package belajarlayout.ars.id.belajarlayout;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentDay3Activity extends AppCompatActivity {

    @BindView(R.id.frame_container)
    FrameLayout frameContainer;
    @BindView(R.id.btn_fragment1)
    Button btnFragment1;
    @BindView(R.id.btn_fragment2)
    Button btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_day3activity);
        ButterKnife.bind(this);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.frame_container, new Fragment1Day3());
        fragmentTransaction.add(R.id.frame_container, new Fragment1Day3());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_fragment1)
    public void onBtnFragment1Clicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new
                Fragment1Day3());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_fragment2)
    public void onBtnFragment2Clicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new
                Fragment1Day3());
        fragmentTransaction.commit();
    }
}
