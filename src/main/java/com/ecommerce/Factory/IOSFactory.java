package com.ecommerce.Factory;

import com.ecommerce.Factory.Components.Button.Button;
import com.ecommerce.Factory.Components.Button.IOSButton;
import com.ecommerce.Factory.Components.DropDown.DropDown;
import com.ecommerce.Factory.Components.DropDown.IOSDropDown;
import com.ecommerce.Factory.Components.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
