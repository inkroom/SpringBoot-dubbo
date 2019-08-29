package com.inkbox.boot.dubboprovider.service;

import com.inkbox.boot.dubboapi.Position;
import com.inkbox.boot.dubboapi.TestService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service(interfaceClass = TestService.class)
public class TestServiceImpl implements TestService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean sign(String key, String value, Position position) {
        logger.debug("调用方传过来的key={},value={},position={}", key, value, position);
        logger.debug("修改了position");
        int x = position.getX();
        position.setX(position.getY());
        position.setY(x);
        return false;
    }

    @Override
    public Position getPosition() {
        Position position = new Position();
        position.setY(224);
        position.setX(4334);
        return position;
    }
}
