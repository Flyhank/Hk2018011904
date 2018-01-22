package com.n9s.flyjet.hk2018011904;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
    // import要delete v4版本,再抓non V4版本

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1 (View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout1, new FragmentA());
        ft.commit();
    }

    public void click2(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout1, new FragmentB());
        ft.commit();
    }
}
