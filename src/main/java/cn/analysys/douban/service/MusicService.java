package cn.analysys.douban.service;

import cn.analysys.douban.pojo.Music;
import cn.analysys.douban.pojo.MusicDetail;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Description:
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/27 21:53
 * @since JDK 1.8
 */
public interface MusicService {
    List<Music> findTop50();

    File export() throws IOException;

    MusicDetail selectDetail(Integer id);
}
