package com.ecommerce.Factory;

import com.ecommerce.Factory.Components.Button.AndroidButton;
import com.ecommerce.Factory.Components.Button.Button;
import com.ecommerce.Factory.Components.DropDown.AndroidDropDown;
import com.ecommerce.Factory.Components.DropDown.DropDown;
import com.ecommerce.Factory.Components.Menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
