package cn.analysys.douban.pojo;

import java.util.Date;

public class FilmEssay {
    private Integer id;
    private Integer movieId;
    private String title;
    private String userIcon;
    private String userName;
    private String content;
    private Date discussDate;
    private Integer usefulCount;
    private Integer unusefulCount;
    private Integer replpCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDiscussDate() {
        return discussDate;
    }

    public void setDiscussDate(Date discussDate) {
        this.discussDate = discussDate;
    }

    public Integer getUsefulCount() {
        return usefulCount;
    }

    public void setUsefulCount(Integer usefulCount) {
        this.usefulCount = usefulCount;
    }

    public Integer getUnusefulCount() {
        return unusefulCount;
    }

    public void setUnusefulCount(Integer unusefulCount) {
        this.unusefulCount = unusefulCount;
    }

    public Integer getReplpCount() {
        return replpCount;
    }

    public void setReplpCount(Integer replpCount) {
        this.replpCount = replpCount;
    }

    @Override
    public String toString() {
        return "FilmEssay{" +
                "id=" + id +
                ", movieId=" + movieId +
                ", title='" + title + '\'' +
                ", userIcon='" + userIcon + '\'' +
                ", userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                ", discussDate=" + discussDate +
                ", usefulCount=" + usefulCount +
                ", unusefulCount=" + unusefulCount +
                ", replpCount=" + replpCount +
                '}';
    }
}
