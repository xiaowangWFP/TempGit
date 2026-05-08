package com.teamgit.codehub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.teamgit.mapper") // 扫描 Mapper 接口所在的包
@SpringBootApplication
public class CodehubApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodehubApplication.class, args);
	}

}
//如来佛祖保佑永无BUG，调试顺利，代码健壮，功能完善！南无啊弥陀佛~~~