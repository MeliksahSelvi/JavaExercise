package com.melik.JavaExercise.designpattern.structural.flyweight.v1.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {

        TreeType treeType = treeTypeMap.get(name);
        if (treeType == null) {
            treeType = new TreeType(name, color, otherTreeData);
            treeTypeMap.put(name, treeType);
        }
        return treeType;
    }
}
