package cn.analysys.douban.pojo;

public class FilmDetail {
    private Integer filmId;
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
    private Float grade;
    private String reviewNum;
    private String essayNum;
    private String commentNum;
    private String content;

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
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

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
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

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public String getReviewNum() {
        return reviewNum;
    }

    public void setReviewNum(String reviewNum) {
        this.reviewNum = reviewNum;
    }

    public String getEssayNum() {
        return essayNum;
    }

    public void setEssayNum(String essayNum) {
        this.essayNum = essayNum;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FilmDetail{" +
                "filmId=" + filmId +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", scriptwriter='" + scriptwriter + '\'' +
                ", actor='" + actor + '\'' +
                ", genre='" + genre + '\'' +
                ", area='" + area + '\'' +
                ", areaId=" + areaId +
                ", language='" + language + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", mins='" + mins + '\'' +
                ", alternateName='" + alternateName + '\'' +
                ", imdb='" + imdb + '\'' +
                ", grade=" + grade +
                ", reviewNum='" + reviewNum + '\'' +
                ", essayNum='" + essayNum + '\'' +
                ", commentNum='" + commentNum + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
