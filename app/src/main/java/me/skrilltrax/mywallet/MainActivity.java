package me.skrilltrax.mywallet;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements QRCodeDialogFragment.Listener{

    private static final int MY_PERMISSIONS_REQUEST_CAMERA_PERMISSION = 1001;
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_id:
                    mTextMessage.setText(R.string.title_id);
                    return true;
                case R.id.navigation_cards:
                    mTextMessage.setText(R.string.title_cards);
                    return true;
                case R.id.navigation_loyalty:
                    mTextMessage.setText(R.string.title_loyalty);
                    return true;
                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.title_profile);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.CAMERA)
                    != PackageManager.PERMISSION_GRANTED) {

                shouldShowRequestPermissionRationale(Manifest.permission.CAMERA);

                requestPermissions(new String[]{Manifest.permission.CAMERA},
                        MY_PERMISSIONS_REQUEST_CAMERA_PERMISSION);

                return;
            }
        }


        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    public void onClick(View view) {
        Intent i = new Intent(view.getContext(),QRScannerActivity.class);
        startActivity(i);
    }


    @Override
    public void onItemClicked(int position) {
        Toast.makeText(this,"YOOO",Toast.LENGTH_SHORT).show();
    }

    public void showsheet(View view) {
        QRCodeDialogFragment.newInstance(1, "Helllooooo").show(getSupportFragmentManager(), "dialog");
    }
}
