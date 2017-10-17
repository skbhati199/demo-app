package demoapp.rahul.com.demoapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import demoapp.rahul.com.demoapp.R;
import demoapp.rahul.com.demoapp.model.Video;
import demoapp.rahul.com.demoapp.model.VideoDemoModel;

/**
 * Created by Skbhati on 17-10-2017.
 * Info Skills Technology Pvt. Ltd.
 * skbhati199@gmail.com
 */

public class VideoRecyclerViewAdapter extends RecyclerView.Adapter<VideoRecyclerViewAdapter.ViewHolder> {

    private final List<Video> mVideoList;

    public VideoRecyclerViewAdapter(VideoDemoModel videoDemoModels) {
        if (videoDemoModels == null || videoDemoModels.getResult() == null || videoDemoModels.getResult().getVideos() == null) {
            mVideoList = new ArrayList<>();
        } else
            mVideoList = videoDemoModels.getResult().getVideos();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_fragment_recycler, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (mVideoList != null)
            holder.bind(mVideoList.get(position).getTitle(),
                    mVideoList.get(position).getUserTitle(),
                    mVideoList.get(position).getImages().getMain());
    }

    @Override
    public int getItemCount() {
        if (mVideoList != null)
            return mVideoList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView vidoesimgage;


        TextView title;

        TextView subtitle;

        ImageView heart_icon;

        ImageView like_icon;


        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            subtitle = itemView.findViewById(R.id.subtitle);
            vidoesimgage = itemView.findViewById(R.id.vidoesimgage);
            heart_icon = itemView.findViewById(R.id.heart_icon);
            like_icon = itemView.findViewById(R.id.like_icon);
        }

        public void bind(String title, String subtitle, String url) {
            this.title.setText(title);
            this.subtitle.setText(subtitle);
            Picasso.with(this.itemView.getContext()).load(url).into(this.vidoesimgage);
        }
    }
}
