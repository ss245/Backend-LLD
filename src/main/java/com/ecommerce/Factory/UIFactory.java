package com.ecommerce.Factory;

import com.ecommerce.Factory.Components.Button.Button;
import com.ecommerce.Factory.Components.DropDown.DropDown;
import com.ecommerce.Factory.Components.Menu.Menu;

import java.awt.*;

public interface UIFactory {
    // Factory methods

    Button createButton();
    DropDown createDropDown();
    Menu createMenu();
}
