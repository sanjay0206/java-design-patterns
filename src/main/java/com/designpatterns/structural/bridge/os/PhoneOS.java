package com.designpatterns.structural.bridge.os;

// Step 1: Abstraction
public interface PhoneOS {
    void upload(String data);

    void download(String url);

    void display(String data);
}
