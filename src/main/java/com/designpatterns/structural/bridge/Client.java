package com.designpatterns.structural.bridge;

import com.designpatterns.structural.bridge.apps.App;
import com.designpatterns.structural.bridge.apps.Facebook;
import com.designpatterns.structural.bridge.apps.Instagram;
import com.designpatterns.structural.bridge.os.Android;
import com.designpatterns.structural.bridge.os.IOS;

public class Client {
    public static void main(String[] args) {
        App app1 = new Facebook(new IOS());
        App app2 = new Instagram(new Android());

        app1.runApp();
        app2.runApp();
    }
}
