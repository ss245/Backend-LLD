package com.ecommerce.Factory;

import com.ecommerce.Factory.Constants.Platform;

public class Flutter {
    // Non Factory Methods
    void refreshUI(){
        System.out.println("Refreshing UI");
    }
    void setTheme(){
        System.out.println("Setting theme");
    }

    UIFactory getUIFactory(Platform platform){
      return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
