package me.skrilltrax.mywallet;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.io.File;

public class MainActivity extends AppCompatActivity implements QRCodeDialogFragment.Listener{

    private static final int MY_PERMISSIONS_REQUEST_CAMERA_PERMISSION = 1001;
    private TextView mTextMessage;
    private TextView appbarText;
    private TextView subtitleText;
    private BottomNavigationView navigation;

    private Typeface tfBold;
    private Typeface tfThin;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    createHome();
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_id:
                    createID();
                    mTextMessage.setText(R.string.title_id);
                    return true;
                case R.id.navigation_cards:
                    createCards();
                    mTextMessage.setText(R.string.title_cards);
                    return true;
                case R.id.navigation_loyalty:
                    createLoyalty();
                    mTextMessage.setText(R.string.title_loyalty);
                    return true;
                case R.id.navigation_profile:
                    createProfile();
                    mTextMessage.setText(R.string.title_profile);
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

        appbarText = findViewById(R.id.appbar_text);
        appbarText.setTypeface(tfBold);

        subtitleText = findViewById(R.id.subtitle);
        subtitleText.setTypeface(tfThin);

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

        return true;
    }

    @Override
    public void onItemClicked(int position) {
        Toast.makeText(this,"YOOO",Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        Intent i = new Intent(view.getContext(),QRScannerActivity.class);
        startActivity(i);
    }

    public void showsheet(View view) {
        QRCodeDialogFragment.newInstance(1, "Helllooooo").show(getSupportFragmentManager(), "dialog");
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

                return;
            }
        }
    }

    public void initTypeFace() {
        tfBold = Typeface.createFromAsset(getAssets(), "font/Montserrat-Bold.ttf");
        tfThin = Typeface.createFromAsset(getAssets(),"font/Montserrat-Medium.ttf");
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
