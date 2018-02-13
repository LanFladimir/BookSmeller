package owner.flaimir.booksmeller.activity.book;

import android.content.Context;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import owner.flaimir.booksmeller.R;
import owner.flaimir.booksmeller.databinding.ActivityMainBinding;

/**
 * MainActivity
 */
public class BookCenterActivity extends AppCompatActivity {
    Context mContext;
    ActivityMainBinding mMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mContext = this;
    }
}
