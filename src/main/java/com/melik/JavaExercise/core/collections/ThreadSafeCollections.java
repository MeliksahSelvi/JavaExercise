package com.melik.JavaExercise.core.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author mselvi
 * @Created 24.01.2024
 */

public class ThreadSafeCollections {
    public static void main(String[] args) {
        Map<String,String> concurrentHashMap=new ConcurrentHashMap<>();
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        Map<Object, Object> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
        Set<Object> synchronizedSet = Collections.synchronizedSet(new HashSet<>());
    }
}
