package com.designpatterns.structural.bridge.apps;

import com.designpatterns.structural.bridge.os.PhoneOS;

// Step 4: Refined Abstraction
public class Instagram implements App {

    PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        System.out.println();
        os.display("cached data");
        os.upload("instagram.com");
        os.display("instagram data");
        os.display("fresh data");
        System.out.println();
    }


}
