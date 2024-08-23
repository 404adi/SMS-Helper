package com.example.smshelper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class logoMain extends AppCompatActivity {
    FirebaseAuth mAuth;
    String getin = "0";
    String getinn;
    String c_mpin = "0";
    String c_mpinn;
    String c_m_pass = "0";
    String c_m_passs;
    String getmob = "0";
    String getmobb;
    String network_conn = "yes";
    static logoMain logomain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();// Hides action bar
        super.onCreate(savedInstanceState);
        logomain = this;
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.newlogo);
        net();
        ImageView im5 = (ImageView) findViewById(R.id.imageView5);
        TextView text = (TextView) findViewById(R.id.textView3);
        Animation ani5 = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top);
        text.startAnimation(ani5);
        Animation ani6 = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top);
        im5.startAnimation(ani6);
        mAuth = FirebaseAuth.getInstance();

        SharedPreferences check_mpin = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        c_mpinn = check_mpin.getString(logoMain.logomain.c_mpin, "");

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        getinn = prefs.getString(logoMain.logomain.getin, "");

        SharedPreferences prefs_mob = getSharedPreferences("passcode_pref_mob", Context.MODE_PRIVATE);
        getmobb = prefs_mob.getString(logoMain.logomain.getmob, "");

        SharedPreferences check_m_pass = getSharedPreferences("passcode_pref", Context.MODE_PRIVATE);
        c_m_passs = check_m_pass.getString(logoMain.logomain.c_m_pass, "");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (network_conn.equals("yes")) {
                    if (getinn.equals("true") && c_mpinn.equals("true")) {
                        Intent intent = new Intent(getApplicationContext(), enter_old_m_pin.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(getApplicationContext(), Onboarding_screens.class);
                        startActivity(intent);
                    }
                } else {
                    Intent LoginI = new Intent(getApplicationContext(), network_error.class);
                    LoginI.putExtra("Net", "Logo");
                    startActivity(LoginI);
                    finish();
                }
                finish();
            }
        }, 3000);
    }


    private boolean isConnected(logoMain logoMain) {

        ConnectivityManager connectivityManager = (ConnectivityManager) logoMain.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo wifiConn = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobileConn = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if ((wifiConn != null && wifiConn.isConnected()) || (mobileConn != null && mobileConn.isConnected())) {
            return true;
        } else {
            return false;
        }
    }

    public void net() {
        if (!isConnected(this)) {
            network_conn = "no";
        } else {
            network_conn = "yes";
        }
    }


    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}