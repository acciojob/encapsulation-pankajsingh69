package com.driver;

public class RWOnly {
    private int num;
    int rwgetter(int num){
        return num;
    }
    void rwsetter(int y){
        num = y;
    }
}
