package com.inkbox.boot.dubboapi.serialization;

import com.inkbox.boot.dubboapi.Position;
import org.apache.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;

public class SerializationOptimizerImpl implements SerializationOptimizer {
    @Override
    public Collection<Class> getSerializableClasses() {
        LinkedList<Class> linkedList = new LinkedList<>();
        linkedList.add(Position.class);
        return linkedList;
    }
}
