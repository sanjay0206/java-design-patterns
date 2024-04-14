package com.designpatterns.structural.bridge.apps;

import com.designpatterns.structural.bridge.os.PhoneOS;

// Step 4: Refined Abstraction
public class Facebook implements App {

    private PhoneOS os; // This is basically the bridge which connects App with the PhoneOS

    public Facebook(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        System.out.println();
        os.upload("Facebook data upload");
        os.download("facebook.com");
        os.display("Facebook data");
        System.out.println();
    }

}
