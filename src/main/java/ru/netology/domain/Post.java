package ru.netology.domain;

public class Post {
    private String id; //идентификатор записи
    private String ownerId; //идентификатор владельца стены, на которой размещена запись
    private String fromId; //идентификатор автора записи
    private String createdBy; //идентификатор администратора, который опубликовал запись
    private String date; //время публикации записи в формате unixtime
    private String text; //текст записи
    private String replyOwnerId; // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private String replyPostId; // идентификатор записи, в ответ на которую была оставлена текущая
    private String friendsOnly; // 1, если запись была создана с опцией «Только для друзей»
    private CommentsInfo commentsInfo;
    private String copyright; //источник материала
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String postType; //тип записи
    private PostSource postSource;
    private Geo geo;
    private String signerId; //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private boolean canPin; // информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может)
    private boolean canDelete; //информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может)
    private boolean canEdit; //информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может)
    private int isPinned; //информация о том, что запись закреплена
    private boolean markedAsAds; //информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет)
    private boolean isFavorite; //true, если объект добавлен в закладки у текущего пользователя
    private int postponedId; //идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(String replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public String getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(String replyPostId) {
        this.replyPostId = replyPostId;
    }

    public String getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(String friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public String getSignerId() {
        return signerId;
    }

    public void setSignerId(String signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
