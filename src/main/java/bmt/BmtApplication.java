package bmt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("bmt.mapper")
public class BmtApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmtApplication.class, args);
    }
}