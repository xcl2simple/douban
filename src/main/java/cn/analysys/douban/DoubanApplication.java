package cn.analysys.douban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.analysys.douban.mapper")
public class DoubanApplication {
	public static void main(String[] args) {
		SpringApplication.run(DoubanApplication.class, args);
	}
}
