package me.skrilltrax.mywallet;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import me.skrilltrax.mywallet.fragments.FragmentBankCard;
import me.skrilltrax.mywallet.fragments.FragmentID;
import me.skrilltrax.mywallet.fragments.FragmentList;
import me.skrilltrax.mywallet.fragments.FragmentLoyaltyCard;
import me.skrilltrax.mywallet.fragments.FragmentProfile;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements QRCodeDialogFragment.Listener{

    private static final int MY_PERMISSIONS_REQUEST_CAMERA_PERMISSION = 1001;
    private TextView mTextMessage;
    private TextView appbarText;
    private TextView subtitleText;
    private BottomNavigationView navigation;

    private Typeface tfBold;
    private Typeface tfThin;
    private Typeface tfMed;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    createHome();
                    switchToFragment(new FragmentList());
                    return true;
                case R.id.navigation_id:
                    createID();
                    switchToFragment(new FragmentID());
                    return true;
                case R.id.navigation_cards:
                    createCards();
                    switchToFragment(new FragmentBankCard());
                    return true;
                case R.id.navigation_loyalty:
                    createLoyalty();
                    switchToFragment(new FragmentLoyaltyCard());
                    return true;
                case R.id.navigation_profile:
                    createProfile();
                    switchToFragment(new FragmentProfile());
                    return true;
            }
            return false;
        }
    };

    private void createHome() {
        subtitleText.setText("Recent Cards");
    }

    private void createID() {
        subtitleText.setText("IDs");
    }

    private void createCards() {
        subtitleText.setText("Credit/Debit Cards");
    }

    private void createLoyalty() {
        subtitleText.setText("Loyalty Cards");
    }

    private void createProfile() {
        subtitleText.setText("Profile");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        checkPermissions();
        initTypeFace();

        MockData mockData = new MockData(this);

        appbarText = findViewById(R.id.appbar_text);
        appbarText.setTypeface(tfBold);

        subtitleText = findViewById(R.id.subtitle);
        subtitleText.setTypeface(tfMed);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentList fragment = new FragmentList();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();

        mTextMessage = (TextView) findViewById(R.id.message);
        navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i = new Intent(this, Settings.class);
        startActivity(i);
        recreate();
        return true;
    }

    @Override
    public void onItemClicked(int position) {
        Toast.makeText(this,"QR Removed",Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        Intent i = new Intent(view.getContext(),QRScannerActivity.class);
        startActivity(i);
    }

    public void showsheet(View view) {
        QRCodeDialogFragment.newInstance(1, "Helllooooo","Yoooooooooo").show(getSupportFragmentManager(), "dialog");
    }

    public void makeTransparent() {
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
    }

    public void checkPermissions() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.CAMERA)
                    != PackageManager.PERMISSION_GRANTED) {

                shouldShowRequestPermissionRationale(Manifest.permission.CAMERA);

                requestPermissions(new String[]{Manifest.permission.CAMERA},
                        MY_PERMISSIONS_REQUEST_CAMERA_PERMISSION);
            }
        }
    }

    public void initTypeFace() {
        tfBold = Typeface.createFromAsset(getAssets(), "font/Montserrat-Bold.ttf");
        tfMed = Typeface.createFromAsset(getAssets(),"font/Montserrat-Medium.ttf");
        tfThin = Typeface.createFromAsset(getAssets(),"font/Montserrat-Thin.ttf");
    }

    public void switchToFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.frame, fragment).commit();
    }

    public void launchadd(View view) {
        Intent i = new Intent(this, AddCardActivity.class);
        startActivity(i);
    }

    static class MyOnClickListener implements View.OnClickListener {


    @Override
    public void onClick(View v) {
//        int itemPosition = recyclerView.indexOfChild(v);
//        Log.e(TAG, String.valueOf(itemPosition));
//        final Intent i = new Intent(v.getContext(),QR.class);
//        v.getContext().startActivity(i);
//
    }
    }
}
