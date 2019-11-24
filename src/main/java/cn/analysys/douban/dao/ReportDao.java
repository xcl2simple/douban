package cn.analysys.douban.dao;

import cn.analysys.douban.pojo.Music;
import cn.analysys.douban.pojo.MusicExport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * @author Mr.Du
 * @version 1.0
 * @date 2019/11/23 20:19
 * @since JDK 1.8
 */

@Repository
public class ReportDao {
    public List<MusicExport> getMusicList(List<Music> musicList){
        List<MusicExport> musicReports=new ArrayList<MusicExport>();
        for(int i=0;i<50;i++){
            MusicExport musicReport=new MusicExport(musicList.get(i).getName(),musicList.get(i).getPlayer(),musicList.get(i).getReleaseDate(),musicList.get(i).getGenre());
            musicReports.add(musicReport);
        }
        return musicReports;
    }
}