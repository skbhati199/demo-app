package demoapp.rahul.com.demoapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import demoapp.rahul.com.demoapp.R;
import demoapp.rahul.com.demoapp.model.VideoDemoModel;

/**
 * Created by Skbhati on 17-10-2017.
 * Info Skills Technology Pvt. Ltd.
 * skbhati199@gmail.com
 */

public class VideoRecyclerViewAdapter extends RecyclerView.Adapter<VideoRecyclerViewAdapter.ViewHolder> {


    private final VideoDemoModel videoDemoModels;

    public VideoRecyclerViewAdapter(VideoDemoModel videoDemoModels) {
        this.videoDemoModels = videoDemoModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_fragment_recycler, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        if (videoDemoModels.getResult() != null)
            return videoDemoModels.getResult().getVideos().size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }

        public void bind() {

        }
    }
}
