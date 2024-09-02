package com.ecommerce.Factory;

import com.ecommerce.Factory.Components.Button.Button;
import com.ecommerce.Factory.Constants.Platform;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.ANDROID);
        Button button = uiFactory.createButton();
        button.clickButton();
        button.showButton();
    }
}
