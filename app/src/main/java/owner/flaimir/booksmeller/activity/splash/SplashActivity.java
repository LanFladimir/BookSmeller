package owner.flaimir.booksmeller.activity.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import owner.flaimir.booksmeller.R;
import owner.flaimir.booksmeller.activity.book.BookCenterActivity;

/**
 * Splash
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, BookCenterActivity.class));
            }
        }, 1000 * 3);
    }

}
