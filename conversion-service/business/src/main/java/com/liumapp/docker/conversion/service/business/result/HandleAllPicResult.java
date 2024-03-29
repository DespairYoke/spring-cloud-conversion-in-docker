package com.liumapp.docker.conversion.service.business.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file HandleAllPicResult.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/9/18
 */
@Component
public class HandleAllPicResult {

    private static Logger logger = LoggerFactory.getLogger(HandleAllPicResult.class);

    @RabbitHandler
    @RabbitListener(queues = "all-pic-converter-result-queue")
    public void process (String msg) {
        logger.info("get info from all-pic-converter-result-queue , msg is : " + msg);
    }

}
