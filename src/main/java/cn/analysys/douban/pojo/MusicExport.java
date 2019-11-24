package cn.analysys.douban.pojo;

import java.util.Date;

/**
 * Description:
 *
 * @author Mr.Du
 * @version 1.0
 * @date 2019/11/23 20:36
 * @since JDK 1.8
 */
public class MusicExport {
    private String name;
    private String player;
    private String releaseDate;
    private String genre;

    public MusicExport(String name, String player, String releaseDate, String genre) {
        this.name = name;
        this.player = player;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}