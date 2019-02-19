package com.rommansabbir.databindingrecyclerviewexample.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.rommansabbir.databindingrecyclerviewexample.BR;
import com.rommansabbir.databindingrecyclerviewexample.R;
import com.rommansabbir.databindingrecyclerviewexample.activities.viewhandler.RecyclerViewItemHandler;
import com.rommansabbir.databindingrecyclerviewexample.model.AccidentModel;

import java.util.List;

public class AccidentRecyclerViewAdapter extends RecyclerView.Adapter<AccidentRecyclerViewAdapter.AccidentViewHolder> {
    private Context context;
    private List<AccidentModel> accidentModelList;

    /**
     * Get the context & list from Parent Activity thorough constructor.
     * @param context
     * @param accidentModelList
     */
    public AccidentRecyclerViewAdapter(Context context, List<AccidentModel> accidentModelList) {
        this.context = context;
        this.accidentModelList = accidentModelList;
    }

    @NonNull
    @Override
    public AccidentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        /**
         * Bind the layout which is going to be used in recycler view
         */
        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.accident_recycler_view_layout, viewGroup, false
        );

        /**
         * Pass the binded layout to the View Holder
         */
        AccidentViewHolder accidentViewHolder = new AccidentViewHolder(viewDataBinding);
        /**
         * Return the view holder
         */
        return accidentViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AccidentViewHolder accidentViewHolder, int i) {
        /**
         * Get data of the item position from model list using model
         */
        AccidentModel accidentModel = accidentModelList.get(i);
        /**
         * Set variable and model to the view holder
         * Variable, which variable has been set to the layout to access the data though model
         */
        accidentViewHolder.binding.setVariable(BR.accidentInfo, accidentModel);

        /**
         * Set variable to the view holder
         * Variable, which will handle the event action
         */
        accidentViewHolder.binding.setVariable(BR.eventHandler, new RecyclerViewItemHandler(context, accidentModel));


    }


    @Override
    public int getItemCount() {
        /**
         * Return the list size
         */
        return accidentModelList.size();
    }

    public static class AccidentViewHolder extends RecyclerView.ViewHolder{
        private final ViewDataBinding binding;

        /**
         * Pass the view to the ViewHolder
         * @param itemView
         */
        public AccidentViewHolder(@NonNull ViewDataBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }

    }
}
