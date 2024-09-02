package com.ecommerce.Factory;

import com.ecommerce.Factory.Components.Button.Button;
import com.ecommerce.Factory.Components.Button.WindowsButton;
import com.ecommerce.Factory.Components.DropDown.DropDown;
import com.ecommerce.Factory.Components.DropDown.WindowsDropDown;
import com.ecommerce.Factory.Components.Menu.Menu;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
