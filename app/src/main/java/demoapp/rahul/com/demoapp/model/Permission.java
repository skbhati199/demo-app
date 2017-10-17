
package demoapp.rahul.com.demoapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Permission {

    @SerializedName("canCreateVideo")
    @Expose
    private Integer canCreateVideo;
    @SerializedName("watchLater")
    @Expose
    private String watchLater;
    @SerializedName("canCreatePlaylist")
    @Expose
    private Integer canCreatePlaylist;
    @SerializedName("canCreateChannel")
    @Expose
    private Integer canCreateChannel;
    @SerializedName("canChannelEnable")
    @Expose
    private String canChannelEnable;

    public Integer getCanCreateVideo() {
        return canCreateVideo;
    }

    public void setCanCreateVideo(Integer canCreateVideo) {
        this.canCreateVideo = canCreateVideo;
    }

    public String getWatchLater() {
        return watchLater;
    }

    public void setWatchLater(String watchLater) {
        this.watchLater = watchLater;
    }

    public Integer getCanCreatePlaylist() {
        return canCreatePlaylist;
    }

    public void setCanCreatePlaylist(Integer canCreatePlaylist) {
        this.canCreatePlaylist = canCreatePlaylist;
    }

    public Integer getCanCreateChannel() {
        return canCreateChannel;
    }

    public void setCanCreateChannel(Integer canCreateChannel) {
        this.canCreateChannel = canCreateChannel;
    }

    public String getCanChannelEnable() {
        return canChannelEnable;
    }

    public void setCanChannelEnable(String canChannelEnable) {
        this.canChannelEnable = canChannelEnable;
    }

}
