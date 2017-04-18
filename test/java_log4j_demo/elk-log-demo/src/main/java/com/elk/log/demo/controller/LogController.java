package com.elk.log.demo.controller;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by pantheon on 2017/2/17.
 */
@RestController
public class LogController {
    Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping(value = "/log",method = RequestMethod.GET)
    public String testLog(){
        logger.info("TEST-pantheon-pantheon--规则更改LogController-testLog:[info]just for test!"+DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        logger.error("TEST-pantheon-pantheon-规则更改LogController-testLog:[error]just for test!"+DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        logger.error("TEST-pantheon-pantheon-规则更改报错：",new RuntimeException());

        return "pantheon get log success ! date-time:"
                + new DateTime(new Date()).toString("yyyy-MM-dd HH:mm:ss");
    }
}
