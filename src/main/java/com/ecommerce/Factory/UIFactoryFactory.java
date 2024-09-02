package com.ecommerce.Factory;

import com.ecommerce.Factory.Constants.Platform;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(Platform platform) {
        if(platform.equals(Platform.ANDROID)){
            return new AndroidFactory();
        }
        else if(platform.equals(Platform.IOS)){
            return new IOSFactory();
        }
        else if(platform.equals(Platform.WINDOWS)){
            return new WindowsFactory();
        }
        else{
            throw new RuntimeException("Platform not supported");
        }
    }
}
