package br.com.ecomoney.ecomoney;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MenuMainActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;

    private HomeFragment homeFragment;
    private LocationFragmentOLD locationFragmentOLD;
    private RequestMoneyFragment requestMoneyFragment;
    private SettingsFragment settingsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_menu_main);

        mMainNav = findViewById(R.id.main_nav);
        mMainFrame = findViewById(R.id.main_frame);

        homeFragment = new HomeFragment();
        locationFragmentOLD = new LocationFragmentOLD();
        requestMoneyFragment = new RequestMoneyFragment();
        settingsFragment = new SettingsFragment();

        setFragment(homeFragment);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.nav_home:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(homeFragment);

                        return true;

                    case R.id.nav_location:
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(locationFragmentOLD);
                        return true;

                    case R.id.nav_requestMoney:
                        mMainNav.setItemBackgroundResource(R.color.colorBar);
                        setFragment(requestMoneyFragment);
                        return true;

                    case R.id.nav_sttings:
                        mMainNav.setItemBackgroundResource(R.color.colorGrey);
                        setFragment(settingsFragment);
                        return true;

                        default:
                            return false;

                }

             }
        });
    }

    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransactionn = getSupportFragmentManager().beginTransaction();

        fragmentTransactionn.replace(R.id.main_frame, fragment);
        fragmentTransactionn.commit();

    }


}
