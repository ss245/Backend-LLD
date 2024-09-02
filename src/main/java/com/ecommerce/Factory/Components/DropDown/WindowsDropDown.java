package com.ecommerce.Factory.Components.DropDown;

public class WindowsDropDown implements DropDown{

    @Override
    public void showDropdown() {
        System.out.println("Showing Windows DropDown");
    }

    @Override
    public void collapse() {
        System.out.println("Collapse Windows DropDown");
    }
}
