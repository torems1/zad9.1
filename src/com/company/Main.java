package com.company;

public class Main {

    public static class Box <T>{
        private T obj;

        Box(T obj){
            this.obj = obj;
        }
        public T getObj(){return obj;}
        public void setObj(T newObj){this.obj = newObj;}
    }
}
