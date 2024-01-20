package com.melik.JavaExercise.designpattern.structural.flyweight.v1.forest;

import com.melik.JavaExercise.designpattern.structural.flyweight.v1.trees.Tree;
import com.melik.JavaExercise.designpattern.structural.flyweight.v1.trees.TreeFactory;
import com.melik.JavaExercise.designpattern.structural.flyweight.v1.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    private List<Tree> treeList = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType treeType = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, treeType);
        treeList.add(tree);
    }

    @Override
    public void paint(Graphics graphics){
        for (Tree tree : treeList) {
            tree.draw(graphics);
        }
    }

}
