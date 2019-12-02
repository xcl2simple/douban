package cn.analysys.douban.pojo;

public class Film {
    private String id;
    private String name;
    private String director;
    private String scriptwriter;
    private String actor;
    private String genre;
    private String area;
    private Integer areaId;
    private String language;
    private String releaseTime;
    private String mins;
    private String alternateName;
    private String imdb;
    private Double grade;
    private Integer reviewNum;
    private Integer essayNum;
    private Integer commentNum;
    private String movieIcon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getScriptwriter() {
        return scriptwriter;
    }

    public void setScriptwriter(String scriptwriter) {
        this.scriptwriter = scriptwriter;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getArea_id() {
        return areaId;
    }

    public void setArea_id(Integer area_id) {
        this.areaId = area_id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getMins() {
        return mins;
    }

    public void setMins(String mins) {
        this.mins = mins;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getReviewNum() {
        return reviewNum;
    }

    public void setReviewNum(Integer reviewNum) {
        this.reviewNum = reviewNum;
    }

    public Integer getEssayNum() {
        return essayNum;
    }

    public void setEssayNum(Integer essayNum) {
        this.essayNum = essayNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getMovieIcon() {
        return movieIcon;
    }

    public void setMovieIcon(String movieIcon) {
        this.movieIcon = movieIcon;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", scriptwriter='" + scriptwriter + '\'' +
                ", actor='" + actor + '\'' +
                ", genre='" + genre + '\'' +
                ", area='" + area + '\'' +
                ", area_id=" + areaId +
                ", language='" + language + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", mins='" + mins + '\'' +
                ", alternateName='" + alternateName + '\'' +
                ", imdb='" + imdb + '\'' +
                ", grade=" + grade +
                ", reviewNum=" + reviewNum +
                ", essayNum=" + essayNum +
                ", commentNum=" + commentNum +
                ", movieIcon='" + movieIcon + '\'' +
                '}';
    }
}
