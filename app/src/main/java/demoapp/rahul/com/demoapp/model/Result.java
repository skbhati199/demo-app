
package demoapp.rahul.com.demoapp.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("permission")
    @Expose
    private Permission permission;
    @SerializedName("videos")
    @Expose
    private List<Video> videos = null;
    @SerializedName("loggedin_user_id")
    @Expose
    private Integer loggedinUserId;
    @SerializedName("total_page")
    @Expose
    private Integer totalPage;
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("next_page")
    @Expose
    private Integer nextPage;
    @SerializedName("total")
    @Expose
    private Integer total;

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public Integer getLoggedinUserId() {
        return loggedinUserId;
    }

    public void setLoggedinUserId(Integer loggedinUserId) {
        this.loggedinUserId = loggedinUserId;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
