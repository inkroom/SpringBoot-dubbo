package com.inkbox.boot.dubboconsumer;

import com.inkbox.boot.dubboapi.Position;
import com.inkbox.boot.dubboapi.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumerApplicationTests {

//    @Reference(version = "1.1", url = "dubbo://127.0.0.1:20881")
    @Reference(registry = "${dubbo.registry.id}")
            TestService service;
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {

        Position position = service.getPosition();
        logger.debug("po {}", position);
        service.sign("2103902", "value=3242", position);
        logger.debug("con {}", position);

    }

}
