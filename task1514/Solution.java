package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(0.5,"gfgf");
        labels.put(0.6,"dfdf");
        labels.put(0.7,"dfdfd");
        labels.put(0.8,"trttr");
        labels.put(0.9,"wqwqw");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
