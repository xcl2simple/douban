package cn.analysys.douban.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Description:
 * 排行榜需要的数据
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/25 20:39
 * @since JDK 1.8
 */
@Getter
@Setter
@ToString
public class MusicVO {

    private String id;

    private String name;

    private String player;

    private String genre;

    private String releaseDate;

}