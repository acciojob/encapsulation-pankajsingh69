package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly obj = new RWOnly();
//    obj.num = 10;
    obj.setName("hi");
    obj.getName();
  }
}