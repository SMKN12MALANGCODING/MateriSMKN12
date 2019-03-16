package belajarlayout.ars.id.belajarlayout.day3;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import belajarlayout.ars.id.belajarlayout.R;
import butterknife.BindView;


public class MainActivity3 extends AppCompatActivity {

    FrameLayout frameContainer;
    Button btnFragment1,btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //binding layout pada variabel
        frameContainer = (FrameLayout) findViewById(R.id.frame_container);
        btnFragment1 = (Button) findViewById(R.id.btn_fragment1);
        btnFragment2 = (Button) findViewById(R.id.btn_fragment2);

        //ini untuk menambahkan fragment kedalam Frame Layout
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.frame_container, new Fragment1());
        fragmentTransaction.add(R.id.frame_container, new Fragment2());
        fragmentTransaction.commit();

        //ini event ketika button di klik
        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_container, new Fragment1());
                fragmentTransaction.commit();
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_container, new Fragment2());
                fragmentTransaction.commit();
            }
        });

    }
}
