package com.company;

public class Ex1 {
    public static void main(String[] args) {
        Main.Box<String> box = new Main.Box<String>("Food");
        System.out.println(box.getObj());
        box.setObj("Pizza");
        System.out.println(box.getObj());
    }
}
