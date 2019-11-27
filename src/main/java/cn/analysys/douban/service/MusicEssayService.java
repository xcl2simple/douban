package cn.analysys.douban.service;

import cn.analysys.douban.pojo.MusicEssay;

/**
 * Description:
 *
 * @author houyi
 * @version 1.0
 * @date 2019/11/27 21:56
 * @since JDK 1.8
 */
public interface MusicEssayService {
    MusicEssay selectById(Integer id);
}
