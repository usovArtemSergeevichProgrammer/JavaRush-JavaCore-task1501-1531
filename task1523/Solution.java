package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    int x;
    String str;

    public Solution() {
    }

    private Solution(int x) {
        this.x = x;
    }

    protected Solution(String str) {
        this.str = str;
    }

    Solution(int x, String str) {
        this.x = x;
        this.str = str;
    }
}

