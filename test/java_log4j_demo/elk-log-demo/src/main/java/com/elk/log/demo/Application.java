package com.elk.log.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by pantheon on 2017/2/17.
 */
@SpringBootApplication
public class Application implements CommandLineRunner{

    Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception{
		SpringApplication.run(Application.class, args);
    }

    public void run(String... arg0) throws Exception {
        //此处可以初始化任务
        logger.info("pantheon-pansheng elk-log-demo start success!");
    }

}