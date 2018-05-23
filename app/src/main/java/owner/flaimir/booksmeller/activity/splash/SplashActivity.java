package owner.flaimir.booksmeller.activity.splash;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

import owner.flaimir.booksmeller.R;
import owner.flaimir.booksmeller.activity.book.BookCenterActivity;
import owner.flaimir.booksmeller.databinding.ActivitySplashBinding;

/**
 * Splash
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        Glide.with(this)
                .load(R.drawable.bg_store_03)
                .into(binding.splashImg);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, BookCenterActivity.class));
            }
        }, 1000 * 3);
    }

}
