package com.liumapp.docker.conversion.service.business.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file HandleDocResult.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/9/18
 */
@Component
public class HandleDocResult {

    private static Logger logger = LoggerFactory.getLogger(HandleDocResult.class);

    @RabbitHandler
    @RabbitListener(queues = "doc-converter-result-queue")
    public void process (String msg) {
        logger.info("get info from doc-converter-result-queue , msg is : " + msg);
    }

}
