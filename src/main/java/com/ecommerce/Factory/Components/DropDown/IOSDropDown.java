package com.ecommerce.Factory.Components.DropDown;

public class IOSDropDown implements DropDown{
    @Override
    public void showDropdown() {
        System.out.println(" Showing IOS DropDown");
    }

    @Override
    public void collapse() {
        System.out.println(" Collapse IOS DropDown");
    }
}
