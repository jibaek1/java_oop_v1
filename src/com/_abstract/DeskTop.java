package com._abstract;

public class DeskTop extends Computer{

    @Override
    public void display() {
        System.out.println("디스플레이");
    }

    @Override
    public void typing() {
        System.out.println("타이핑 합니다.");
    }
}
