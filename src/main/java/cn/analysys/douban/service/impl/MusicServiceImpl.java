package cn.analysys.douban.service.impl;

import cn.analysys.douban.dao.ReportDao;
import cn.analysys.douban.mapper.MusicMapper;
import cn.analysys.douban.pojo.Music;
import cn.analysys.douban.pojo.MusicDetail;
import cn.analysys.douban.pojo.MusicEssay;
import cn.analysys.douban.pojo.MusicReview;
import cn.analysys.douban.service.MusicService;
import org.jxls.common.Context;
import org.jxls.transform.poi.PoiTransformer;
import org.jxls.util.JxlsHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private MusicMapper musicMapper;

    @Autowired
    private ReportDao reportDao;

    @Override
    public List<Music> findTop50() {
        List<Music> musics = musicMapper.selectTop50();
        return musics;
    }

    @Override
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

    @Override
    public MusicDetail selectDetail(Integer id){

        List<MusicReview> reviews = musicMapper.selectTop10(id);

        if (reviews == null){
            return null;
        }
        Music music = musicMapper.selectById(id);

        if (music == null){
            return null;
        }
        MusicDetail musicDetail = new MusicDetail(music,reviews);

        return musicDetail;
    }

    @Override
    public MusicEssay selectById(Integer essayId){
        MusicEssay musicEssay = musicMapper.selectEssay(essayId);
        System.out.println(musicEssay);
        return musicEssay;
    }

}
