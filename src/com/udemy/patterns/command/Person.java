package com.udemy.patterns.command;

public class Person {

    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new OnCommand(television));
        remoteControl.pressButton();
        remoteControl.setCommand(new OffCommand(television));
        remoteControl.pressButton();
    }
}
