package owner.flaimir.booksmeller.activity.book;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import owner.flaimir.booksmeller.R;

/**
 * MainActivity
 */
public class BookCenterActivity extends AppCompatActivity {
    Context mContext;
    ImageView main_bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookcenter);
        mContext = this;
        main_bg = findViewById(R.id.main_bg);
        Glide.with(mContext)
                .load(getImg(3))
                .into(main_bg);
    }

    private int getImg(int id) {
        return mContext.getResources().getIdentifier("bg_store_0" + id, "drawable",
                mContext.getPackageName());
    }
}
