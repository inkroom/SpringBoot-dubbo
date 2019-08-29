package com.inkbox.boot.dubboapi;

/**
 * rpc公用接口
 */
public interface TestService {

    boolean sign(String key, String value, Position position);

    Position getPosition();
}
