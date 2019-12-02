package cn.analysys.douban.pojo;

import io.swagger.models.auth.In;

import java.util.Date;

public class FilmParam {
    private Date date;
    private Integer areaId;
    private Integer limitnum;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getArea_id() {
        return areaId;
    }

    public void setArea_id(Integer area_id) {
        this.areaId = area_id;
    }

    public Integer getLimitnum() {
        return limitnum;
    }

    public void setLimitnum(Integer limitnum) {
        this.limitnum = limitnum;
    }
}
