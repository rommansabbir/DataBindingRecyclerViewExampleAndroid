package com.rommansabbir.databindingrecyclerviewexample.activities.viewhandler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.rommansabbir.databindingrecyclerviewexample.activities.UI.MainActivity;
import com.rommansabbir.databindingrecyclerviewexample.activities.UI.SecondActivity;
import com.rommansabbir.databindingrecyclerviewexample.model.AccidentModel;

public class RecyclerViewItemHandler extends AppCompatActivity {
    private static final String TAG = "RecyclerViewItemHandler";
    private Context context;
    private AccidentModel accidentModel;

    /**
     * Instantiate with context and model
     * @param context
     * @param accidentModel
     */
    public RecyclerViewItemHandler(Context context, AccidentModel accidentModel) {
        this.context = context;
        this.accidentModel = accidentModel;
    }

    /**
     * This method responsible for loading second activity
     * @param view
     */
    public void loadSecondActivity(View view){
        Intent intent  = new Intent(context, SecondActivity.class);
        intent.putExtra("extra", accidentModel.getFullName());
        ((MainActivity)context).startActivity(intent);
        finish();
    }
}
