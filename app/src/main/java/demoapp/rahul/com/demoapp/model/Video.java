
package demoapp.rahul.com.demoapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("video_id")
    @Expose
    private Integer videoId;
    @SerializedName("adult")
    @Expose
    private Integer adult;
    @SerializedName("approve")
    @Expose
    private Integer approve;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("search")
    @Expose
    private Integer search;
    @SerializedName("owner_type")
    @Expose
    private String ownerType;
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    @SerializedName("creation_date")
    @Expose
    private String creationDate;
    @SerializedName("modified_date")
    @Expose
    private String modifiedDate;
    @SerializedName("view_count")
    @Expose
    private Integer viewCount;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("photo_id")
    @Expose
    private Integer photoId;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("file_id")
    @Expose
    private Integer fileId;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("rotation")
    @Expose
    private Integer rotation;
    @SerializedName("artists")
    @Expose
    private String artists;
    @SerializedName("offtheday")
    @Expose
    private Integer offtheday;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("favourite_count")
    @Expose
    private Integer favouriteCount;
    @SerializedName("is_locked")
    @Expose
    private Integer isLocked;
    @SerializedName("is_featured")
    @Expose
    private Integer isFeatured;
    @SerializedName("is_sponsored")
    @Expose
    private Integer isSponsored;
    @SerializedName("is_hot")
    @Expose
    private Integer isHot;
    @SerializedName("like_count")
    @Expose
    private Integer likeCount;
    @SerializedName("subcat_id")
    @Expose
    private Integer subcatId;
    @SerializedName("subsubcat_id")
    @Expose
    private Integer subsubcatId;
    @SerializedName("importthumbnail")
    @Expose
    private Integer importthumbnail;
    @SerializedName("cover")
    @Expose
    private Integer cover;
    @SerializedName("user_title")
    @Expose
    private String userTitle;
    @SerializedName("canWatchlater")
    @Expose
    private Boolean canWatchlater;
    @SerializedName("images")
    @Expose
    private Images images;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getAdult() {
        return adult;
    }

    public void setAdult(Integer adult) {
        this.adult = adult;
    }

    public Integer getApprove() {
        return approve;
    }

    public void setApprove(Integer approve) {
        this.approve = approve;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSearch() {
        return search;
    }

    public void setSearch(Integer search) {
        this.search = search;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public Integer getOfftheday() {
        return offtheday;
    }

    public void setOfftheday(Integer offtheday) {
        this.offtheday = offtheday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getFavouriteCount() {
        return favouriteCount;
    }

    public void setFavouriteCount(Integer favouriteCount) {
        this.favouriteCount = favouriteCount;
    }

    public Integer getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Integer isLocked) {
        this.isLocked = isLocked;
    }

    public Integer getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(Integer isFeatured) {
        this.isFeatured = isFeatured;
    }

    public Integer getIsSponsored() {
        return isSponsored;
    }

    public void setIsSponsored(Integer isSponsored) {
        this.isSponsored = isSponsored;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getSubcatId() {
        return subcatId;
    }

    public void setSubcatId(Integer subcatId) {
        this.subcatId = subcatId;
    }

    public Integer getSubsubcatId() {
        return subsubcatId;
    }

    public void setSubsubcatId(Integer subsubcatId) {
        this.subsubcatId = subsubcatId;
    }

    public Integer getImportthumbnail() {
        return importthumbnail;
    }

    public void setImportthumbnail(Integer importthumbnail) {
        this.importthumbnail = importthumbnail;
    }

    public Integer getCover() {
        return cover;
    }

    public void setCover(Integer cover) {
        this.cover = cover;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public Boolean getCanWatchlater() {
        return canWatchlater;
    }

    public void setCanWatchlater(Boolean canWatchlater) {
        this.canWatchlater = canWatchlater;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

}
