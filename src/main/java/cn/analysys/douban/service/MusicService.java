package cn.analysys.douban.service;

import cn.analysys.douban.controller.MusicController;
import cn.analysys.douban.dao.ReportDao;
import cn.analysys.douban.mapper.MusicMapper;
import cn.analysys.douban.mapper.MusicReviewMapper;
import cn.analysys.douban.pojo.Music;
import cn.analysys.douban.pojo.MusicDetail;
import cn.analysys.douban.pojo.MusicReview;
import org.jxls.common.Context;
import org.jxls.transform.poi.PoiTransformer;
import org.jxls.util.JxlsHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicMapper musicMapper;

    @Autowired
    private MusicReviewMapper reviewMapper;

    @Autowired
    private ReportDao reportDao;

    public List<Music> findTop50() {
        List<Music> musics = musicMapper.selectTop50();
        return musics;
    }

    public File export() throws IOException {
        List<Music> musicList = musicMapper.selectTop50();
        InputStream is = new FileInputStream("D:/template/export_template.xlsx");
        OutputStream os = new FileOutputStream("D:/template/MusicTop50.xlsx");

        Context context = PoiTransformer.createInitialContext();
        if (musicList.size() > 0) {
            context.putVar("musicList", musicList);
        }
        JxlsHelper.getInstance().processTemplate(is , os , context);
        return new File("D:/template/MusicTop50.xlsx");
    }

    public MusicDetail selectDetail(Integer id){

        List<MusicReview> reviews = reviewMapper.selectTop10(id);

        Music music = musicMapper.selectById(id);

        MusicDetail musicDetail = new MusicDetail(music,reviews);

        return musicDetail;
    }
}
