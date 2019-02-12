package bmt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("bmt.mapper")

/**
* Title: BmtApplication  
* Description:启动
* @author Dalphist  
* @date 2019年2月11日
 */
public class BmtApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmtApplication.class, args);
    }
}
