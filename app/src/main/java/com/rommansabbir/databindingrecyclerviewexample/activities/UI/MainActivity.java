package com.rommansabbir.databindingrecyclerviewexample.activities.UI;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.rommansabbir.databindingrecyclerviewexample.R;
import com.rommansabbir.databindingrecyclerviewexample.adapters.AccidentRecyclerViewAdapter;
import com.rommansabbir.databindingrecyclerviewexample.databinding.ActivityMainBinding;
import com.rommansabbir.databindingrecyclerviewexample.model.AccidentModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private List<AccidentModel> accidentModelList;
    private AccidentModel accidentModel, accidentModel1;
    private AccidentRecyclerViewAdapter accidentRecyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        accidentModelList = new ArrayList<>();

        /**
         * Instantiate ActivityMainBinding
         * Set RecyclerView layout manager
         * Set RecyclerView has fixed layout
         */
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.accidentRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.accidentRecyclerView.setHasFixedSize(true);

        /**
         * Some dummy model info
         */
        accidentModel = new AccidentModel();
        accidentModel.setFullName("Romman Sabbir");
        accidentModel.setLocation("Somehere");
        accidentModel.setAccidentTime("Something");

        accidentModel1 = new AccidentModel();
        accidentModel1.setFullName("Dipanjal Maitra");
        accidentModel1.setLocation("Somehere");
        accidentModel1.setAccidentTime("Something");

        /**
         * Add the dummy models to list
         */
        accidentModelList.add(accidentModel);
        accidentModelList.add(accidentModel1);

        /**
         * Instantiate Adapter
         * Set the adapter to RecyclerView
         */
        accidentRecyclerViewAdapter = new AccidentRecyclerViewAdapter(this, accidentModelList);
        activityMainBinding.accidentRecyclerView.setAdapter(accidentRecyclerViewAdapter);
    }
}
