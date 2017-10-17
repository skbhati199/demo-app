package demoapp.rahul.com.demoapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import demoapp.rahul.com.demoapp.adapters.VideoRecyclerViewAdapter;
import demoapp.rahul.com.demoapp.apiservice.DemoService;
import demoapp.rahul.com.demoapp.model.VideoDemoModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class VideoActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    private VideoDemoModel videoDemoModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        videoDemoModel = new VideoDemoModel();
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), videoDemoModel);

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {

        super.onSaveInstanceState(outState, outPersistentState);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_video, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public static class PlaceholderFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";
        private static VideoDemoModel mVideoList;

        public PlaceholderFragment() {
        }


        public static PlaceholderFragment newInstance(int sectionNumber, VideoDemoModel videoList) {
            PlaceholderFragment.mVideoList = videoList;
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_video, container, false);
            final RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
            Retrofit retrofit = DemoApp.getRetrofit();
            DemoService service = retrofit.create(DemoService.class);
            Call<VideoDemoModel> callVideos = service.getListVideos();

            callVideos.enqueue(new Callback<VideoDemoModel>() {
                @Override
                public void onResponse(Call<VideoDemoModel> call, Response<VideoDemoModel> response) {
                    if (response.body() != null) {
                        VideoDemoModel videoDemoModel = response.body();
                        VideoRecyclerViewAdapter videoRecyclerViewAdapter = new VideoRecyclerViewAdapter(videoDemoModel);
                        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
                        recyclerView.setLayoutManager(layoutManager);
                        recyclerView.setAdapter(videoRecyclerViewAdapter);
                    }
                }

                @Override
                public void onFailure(Call<VideoDemoModel> call, Throwable t) {
                    t.printStackTrace();
                    Toast.makeText(getActivity(), "Server error onFailure", Toast.LENGTH_SHORT).show();
                }
            });


            return rootView;
        }


    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        private VideoDemoModel mVideoList;

        public SectionsPagerAdapter(FragmentManager fm, VideoDemoModel mVideoList) {
            super(fm);
            this.mVideoList = mVideoList;
        }

        @Override
        public Fragment getItem(int position) {

            return PlaceholderFragment.newInstance(position + 1, mVideoList);
        }

        @Override
        public int getCount() {

            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Browse Videos";
                case 1:
                    return "Browse Channel";
                case 2:
                    return "Browse P";
            }
            return null;
        }


        public void addItem(VideoDemoModel videoDemoModel) {
            this.mVideoList = videoDemoModel;
            notifyDataSetChanged();
        }
    }
}
