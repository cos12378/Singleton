package com.example.singletonpattern;

public class Singleton {

    static Singleton singletonObject; // 정적변수
    private Singleton() {}; // private 생성자


    public static Singleton getInstance(){ //객체 반환 정적 메서드
        if(singletonObject == null){
            singletonObject = new Singleton();
        }
        return singletonObject;
    }
}
