package com.rommansabbir.databindingrecyclerviewexample.activities.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.rommansabbir.databindingrecyclerviewexample.R;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /**
         * Check if getActionBar() is null or not
         * if not, display up button
         */
        if(getActionBar() != null){
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        /**
         * If intent is not null
         * get the extra's from intent
         */
        if (getIntent() != null){
            Log.d(TAG, "onCreate: ");
            String fullName = getIntent().getStringExtra("extra");
            Toast.makeText(this, fullName, Toast.LENGTH_SHORT).show();
        }
    }
}
