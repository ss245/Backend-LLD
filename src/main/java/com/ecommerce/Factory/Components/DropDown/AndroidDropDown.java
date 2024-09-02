package com.ecommerce.Factory.Components.DropDown;

public class AndroidDropDown implements DropDown{

    @Override
    public void showDropdown() {
        System.out.println("Showing Android DropDown");
    }

    @Override
    public void collapse() {
        System.out.println("Collapse Android DropDown");
    }
}
