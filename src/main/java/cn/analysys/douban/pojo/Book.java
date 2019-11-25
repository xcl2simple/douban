package cn.analysys.douban.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Book {
    private String icon_url;
    private String name;
    private String author;
    private String intro;
}
